/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Author: jiaming.liu
 * Createdate: 2019/5/11
 */
package com.sunyur.api.param.common;

/**
 * @Description:api 网关公共参数体， 需要和api 项目 ApiMsg结构保持一致
 * @project common
 * @class ApiMsg.java 
 * @author lishaochun
 * @version 1.0
 * @date 2019年10月14日 下午5:34:50
 */
public class ApiMsg {

    private String business;
    private String event;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
