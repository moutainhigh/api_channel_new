package com.sunyur.api.channel.model.order;

import java.math.BigDecimal;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/8/28 17:36
 */
public class ReceiveOrderItemDetailModel {

    private String code;
    private Integer type;
    private String orderCode;
    private String deptCode;
    private String orderItemCode;
    private String sendOrderCode;
    private String materielCode;
    private String sendOrderItemCode;
    private BigDecimal receiveCount;
    private BigDecimal receiveAmount;
    private BigDecimal receiveTaxExcludedAmount;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderItemCode() {
        return orderItemCode;
    }

    public void setOrderItemCode(String orderItemCode) {
        this.orderItemCode = orderItemCode;
    }

    public String getSendOrderCode() {
        return sendOrderCode;
    }

    public void setSendOrderCode(String sendOrderCode) {
        this.sendOrderCode = sendOrderCode;
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

    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public BigDecimal getReceiveTaxExcludedAmount() {
        return receiveTaxExcludedAmount;
    }

    public void setReceiveTaxExcludedAmount(BigDecimal receiveTaxExcludedAmount) {
        this.receiveTaxExcludedAmount = receiveTaxExcludedAmount;
    }

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
}
