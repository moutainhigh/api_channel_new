package com.sunyur.api.channel.message.param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 11:33
 */
public class ReceiveOrderMsgData {

    // 收货单编号
    private String code;
    // 发货单编号
    private String sendOrderCode;
    // 操作人编号
    private String operatorCode;
    // 行信息
    private List<Item> items;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSendOrderCode() {
        return sendOrderCode;
    }

    public void setSendOrderCode(String sendOrderCode) {
        this.sendOrderCode = sendOrderCode;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public static class Item {

        private String orderCode;
        private String sendOrderItemCode;
        private BigDecimal receiveCount;

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getSendOrderItemCode() {
            return sendOrderItemCode;
        }

        public void setSendOrderItemCode(String sendOrderItemCode) {
            this.sendOrderItemCode = sendOrderItemCode;
        }

        public BigDecimal getReceiveCount() {
            return receiveCount;
        }

        public void setReceiveCount(BigDecimal receiveCount) {
            this.receiveCount = receiveCount;
        }
    }

}
