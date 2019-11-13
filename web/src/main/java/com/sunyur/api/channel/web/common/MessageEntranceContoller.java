/**
 * Copyright(c) 2004-2018 eaju.com, All Rights Reserved.
 * Project: web
 * Author: lishaochun
 * Createdate: 下午5:37:06
 * Version: 1.0
 */
package com.sunyur.api.channel.web.common;

import com.sunyur.api.channel.message.MsgPutHandler;
import com.sunyur.api.channel.message.MsgPutHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.param.common.ApiMsg;

/**
 * @Description:网关http通知入口
 * @project web
 * @class MessageEntranceContoller.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年10月14日 下午5:37:06
 */
@Controller
@RequestMapping("/http/message/entrance")
public class MessageEntranceContoller {

    private final static Logger LOGGER = LoggerFactory.getLogger(MessageEntranceContoller.class);

    @Autowired
    private MsgPutHandlerRegistry handlerRegistry;

    /**
     * @Description:前置机统一消息入口
     * @author lishaochun
     * @date 2019年10月14日 下午5:44:23
     * @param apiMsg    api发送过来的消息对象
     * @return
     */
    @RequestMapping(value = "/put", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public ModelResult<Boolean> getMessage(@RequestBody ApiMsg apiMsg){

        ModelResult<Boolean> result = new ModelResult<>();
        result.setContent(false);

        if (apiMsg == null) {
            LOGGER.info("apiMsg is null.");
            return result;
        }

        try {
            LOGGER.info("get apiMsg message. apiMsg:{}", JSON.toJSONString(apiMsg));
            String type = apiMsg.getBusiness()+":"+apiMsg.getEvent();
            MsgPutHandler oppoMsgPutHandler = handlerRegistry.get(type);
            return oppoMsgPutHandler.handle(JSON.toJSONString(apiMsg.getData()));
        } catch (Exception e) {
            LOGGER.info("exec message exception. apiMsg:{}", JSON.toJSONString(apiMsg), e);
        }

        return result;
    }
}
