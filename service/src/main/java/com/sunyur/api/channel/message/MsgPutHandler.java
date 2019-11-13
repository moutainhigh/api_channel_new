package com.sunyur.api.channel.message;

import com.sunyur.api.channel.common.base.ModelResult;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 10:33
 */
public interface MsgPutHandler {

    ModelResult<Boolean> handle(String msg);
}
