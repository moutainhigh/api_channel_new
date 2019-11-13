package com.sunyur.api.channel.model.order;

import java.io.Serializable;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/8/29 11:43
 */
public class OppoOrderCancelModel implements Serializable{

    private static final long serialVersionUID = 214549314557716771L;

    // 系统标识
    private String source_system;
    // 来源订单号
    private String source_order;
    // 来源订单行号
    private String source_line_num;
    // 状态
    private String status;
    // 消息内容
    private String message;

    public String getSource_system() {
        return source_system;
    }

    public void setSource_system(String source_system) {
        this.source_system = source_system;
    }

    public String getSource_order() {
        return source_order;
    }

    public void setSource_order(String source_order) {
        this.source_order = source_order;
    }

    public String getSource_line_num() {
        return source_line_num;
    }

    public void setSource_line_num(String source_line_num) {
        this.source_line_num = source_line_num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
