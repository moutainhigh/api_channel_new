package com.sunyur.api.channel.model.order;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/8/28 17:58
 */
public class InvoiceOrderItemDetailModel {

    // 发票单行编号
    private String code;
    // 收货单编号
    private String receiveOrderCode;
    // 收货单行编号
    private String receiveOrderItemCode;
    // 订单编号
    private String orderCode;
    // 订单行编号
    private String orderItemCode;
    // 物料编号
    private String materielCode;
    // 物料名称
    private String materielName;
    // 商品含税价格
    private BigDecimal taxIncludedPrice;
    // 商品未税价格
    private BigDecimal taxExcludedPrice;
    // 税率
    private BigDecimal taxRate;
    // 单位编号
    private String unitCode;
    // 发票单行商品个数
    private BigDecimal count;
    // 发票单行商品总税额
    private BigDecimal taxAmount;
    // 发票含税总金额
    private BigDecimal taxIncludedAmount;
    // 发票不含税总金额
    private BigDecimal taxExcludedAmount;
    // 扩展信息
    private Map<String,Object> extend;
    // 结算单号
    private String settlementOrderCode;
    // 对账期间
    private String settlementPeriod;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReceiveOrderCode() {
        return receiveOrderCode;
    }

    public void setReceiveOrderCode(String receiveOrderCode) {
        this.receiveOrderCode = receiveOrderCode;
    }

    public String getReceiveOrderItemCode() {
        return receiveOrderItemCode;
    }

    public void setReceiveOrderItemCode(String receiveOrderItemCode) {
        this.receiveOrderItemCode = receiveOrderItemCode;
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

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    public String getMaterielName() {
        return materielName;
    }

    public void setMaterielName(String materielName) {
        this.materielName = materielName;
    }

    public BigDecimal getTaxIncludedPrice() {
        return taxIncludedPrice;
    }

    public void setTaxIncludedPrice(BigDecimal taxIncludedPrice) {
        this.taxIncludedPrice = taxIncludedPrice;
    }

    public BigDecimal getTaxExcludedPrice() {
        return taxExcludedPrice;
    }

    public void setTaxExcludedPrice(BigDecimal taxExcludedPrice) {
        this.taxExcludedPrice = taxExcludedPrice;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    public void setTaxIncludedAmount(BigDecimal taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
    }

    public BigDecimal getTaxExcludedAmount() {
        return taxExcludedAmount;
    }

    public void setTaxExcludedAmount(BigDecimal taxExcludedAmount) {
        this.taxExcludedAmount = taxExcludedAmount;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public String getSettlementOrderCode() {
        return settlementOrderCode;
    }

    public void setSettlementOrderCode(String settlementOrderCode) {
        this.settlementOrderCode = settlementOrderCode;
    }

    public String getSettlementPeriod() {
        return settlementPeriod;
    }

    public void setSettlementPeriod(String settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }
}
