package com.sunyur.api.channel.model.order;

import java.io.Serializable;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:PO获取状态结果
 * @date 2019/8/29 9:34
 */
public class OppoOrderStatusModel implements Serializable {

    private static final long serialVersionUID = -211437108785863192L;

    private String status;
    // 错误消息(状态是E时返回)
    private String message;
    // 系统标识(目前固定：SUNYUR)
    private String source_system;
    // 来源单号
    private String source_order;
    // Oppo订单编号
    private String po_num;

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

    public String getPo_num() {
        return po_num;
    }

    public void setPo_num(String po_num) {
        this.po_num = po_num;
    }
}
