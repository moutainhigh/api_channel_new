package com.sunyur.api.channel.model.order;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 17:35
 */
public class OrderDetailItemModel {

    // 行单号
    private String code;
    // 数量
    private BigDecimal count;
    // 含税单价
    private BigDecimal price;
    // 不含税单价
    private BigDecimal untaxedPrice;
    // 物料编号
    private String materielCode;
    // 税码
    private String taxCode;
    // 收货地址编码
    private String receiveAddressCode;
    // 期望交货日期
    private Date estimated_arrive_time;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getUntaxedPrice() {
        return untaxedPrice;
    }

    public void setUntaxedPrice(BigDecimal untaxedPrice) {
        this.untaxedPrice = untaxedPrice;
    }

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getReceiveAddressCode() {
        return receiveAddressCode;
    }

    public void setReceiveAddressCode(String receiveAddressCode) {
        this.receiveAddressCode = receiveAddressCode;
    }

    public Date getEstimated_arrive_time() {
        return estimated_arrive_time;
    }

    public void setEstimated_arrive_time(Date estimated_arrive_time) {
        this.estimated_arrive_time = estimated_arrive_time;
    }
}
