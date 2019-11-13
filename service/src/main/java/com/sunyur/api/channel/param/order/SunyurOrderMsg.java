package com.sunyur.api.channel.param.order;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:接收到消息内容
 * @date 2019/9/2 16:12
 */
public class SunyurOrderMsg {

    // 业务类型
    private String business;
    // 事件
    private String event;
    // 消息数据
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
