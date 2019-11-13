package com.sunyur.api.channel.model.order;

import java.util.List;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/8/28 17:35
 */
public class ReceiveOrderDetailModel {

    // 收货单编号
    private String code;
    // 收货人编号
    private String operatorCode;
    // 收货单行信息
    private List<ReceiveOrderItemDetailModel> items;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public List<ReceiveOrderItemDetailModel> getItems() {
        return items;
    }

    public void setItems(List<ReceiveOrderItemDetailModel> items) {
        this.items = items;
    }
}
