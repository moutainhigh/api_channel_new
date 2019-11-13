/**
 * Copyright(c) 2004-2018 eaju.com, All Rights Reserved. Project: api_share Author: lishaochun Createdate: 下午2:40:52
 * Version: 1.0
 */
package com.sunyur.api.channel.model.purchase;

import java.math.BigDecimal;

/**
 * @Description:出库行模型
 * @project api_share
 * @class RecipientsItemWarehouseOutModel.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年9月29日 下午2:40:52
 */
public class RecipientsItemWarehouseOutModel {

    /**
     * 物料代码
     */
    private String     materielCode;

    /**
     * 数量
     */
    private BigDecimal count;

//    /**
//     * 传商越供应商code
//     */
//    private String     supplierCode;

    /**
     * 领用单行id
     */
    private long       id;

    /**
     * 传领用单的外部单号（暂时不做，与客户再次确认）
     */
    private String     outsideNo;

    /**
     * 单位
     */
    private String     unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

//    public String getSupplierCode() {
//        return supplierCode;
//    }
//
//    public void setSupplierCode(String supplierCode) {
//        this.supplierCode = supplierCode;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOutsideNo() {
        return outsideNo;
    }

    public void setOutsideNo(String outsideNo) {
        this.outsideNo = outsideNo;
    }
}
