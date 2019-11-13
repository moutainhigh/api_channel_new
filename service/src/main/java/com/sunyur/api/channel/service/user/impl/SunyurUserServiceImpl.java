package com.sunyur.api.channel.service.user.impl;

import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.base.ModelResultUtil;
import com.sunyur.api.channel.common.httpclient.ApiHttpClient;
import com.sunyur.api.channel.param.user.SunyurPurchaserUserParam;
import com.sunyur.api.channel.service.user.SunyurUserService;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @Description 商越用户Service
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/23 1:01 PM
 */
@Service("sunyurUserService")
public class SunyurUserServiceImpl implements SunyurUserService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(SunyurUserServiceImpl.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(SunyurUserServiceImpl.class);

    @Autowired
    private HttpClient httpClient;

    @Value("${remote.api.user.http}")
    private String userHttp;
    @Value("${remote.api.base.http}")
    private String baseUrl;
    @Value("${app_key}")
    private String appkey;
    @Value("${app_secret}")
    private String appSecret;
    /**
     * 每批次数量
     */
    private final static int BATCH_INDEX = 300;

    /**
     * @Description: 调用商越用户接口同步用户
     * @author: chenyu.zheng
     * @date: 2019/8/23 1:08 PM
     * @param [listUserParam]
     * @return
     */
    @Override
    public ModelResult<Boolean> batchSaveUser(List<SunyurPurchaserUserParam> listUserParam) {
        LOGGER_INFO.info("同步给商越的用户数量count: {}",listUserParam.size());
        ModelResult<Boolean> result = new ModelResult<Boolean>();
        result.setContent(false);
        try {
            int listSize = listUserParam.size();
            int toIndex = BATCH_INDEX;

            //分批传给商越每次300条
            for(int i = 0;i<listSize;i+=BATCH_INDEX){
                if(i+BATCH_INDEX>listSize){
                    toIndex=listSize-i;
                }
                List<SunyurPurchaserUserParam> newList = listUserParam.subList(i,i+toIndex);
                // 同一批次不能重复
                List<SunyurPurchaserUserParam> unique = newList.stream().collect(
                        Collectors.collectingAndThen(
                                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(SunyurPurchaserUserParam::getCode))), ArrayList::new)
                );
                //同步给商越
                String reqJsonStr = JSON.toJSONString(unique);
                ModelResult<Boolean>  sunyurResult = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, baseUrl, userHttp, reqJsonStr);
                if (!ModelResultUtil.isSuccess(sunyurResult) || !sunyurResult.getContent()){
                    LOGGER_ERROR.error("同步给商越用户错误, userList is {} " , JSON.toJSONString(newList));
                }
            }
            result.setContent(true);
        } catch (Exception e) {
            LOGGER_ERROR.error("batchcreateUser is Exception ", e);
        }
        return result;
    }
}
