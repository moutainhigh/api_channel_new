package com.sunyur.api.channel.message;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 10:31
 */
public class MsgPutHandlerRegistry {

    private final Map<String, MsgPutHandler> handlerMap = new HashMap<>();

    public void add(String event, MsgPutHandler handler) {
        handlerMap.put(event, handler);
    }

    public MsgPutHandler get(String event) {
        return handlerMap.get(event);
    }

}
