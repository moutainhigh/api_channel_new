/**
 * Copyright(c) 2004-2018 eaju.com, All Rights Reserved. Project: api_share Author: lishaochun Createdate: 下午2:24:25
 * Version: 1.0
 */
package com.sunyur.api.channel.model.purchase;

import java.math.BigDecimal;

/**
 * @Description:mo行信息
 * @project api_share
 * @class RecipientsSubmitMoItemInfoModel.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年9月30日 下午2:24:25
 */
public class RecipientsMoItemInfoModel {

    /**
     * 物料代码
     */
    private String     materielCode;

    /**
     * 物料名称
     */
    private String     materielName;

    /**
     * 单位
     */
    private String     productUnit;

    /**
     * 数量
     */
    private BigDecimal count;

    /**
     * 备注
     */
    private String     remark;

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

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
