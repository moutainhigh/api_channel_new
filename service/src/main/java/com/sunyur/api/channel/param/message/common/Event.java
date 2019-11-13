/**
 * Copyright(c) 2004-2018 eaju.com, All Rights Reserved. Project: api_share Author: lishaochun Createdate: 下午8:08:05
 * Version: 1.0
 */
package com.sunyur.api.channel.param.message.common;

/**
 * @Description:事件最小单元
 * @project api_share
 * @class BaseApiEventPack.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年9月27日 下午8:08:05
 */
public class Event {

    // 业务类型
    private String business;
    // 事件
    private String event;

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
