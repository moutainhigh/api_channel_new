/**
 * Copyright(c) 2004-2018 eaju.com, All Rights Reserved. Project: api_share Author: lishaochun Createdate: 上午10:37:04
 * Version: 1.0
 */
package com.sunyur.api.channel.model.purchase;

import java.util.Date;
import java.util.List;

/**
 * @Description:领用出库数据模型
 * @project api_share
 * @class RecipientsWarehouseOutModel.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年9月29日 上午10:37:04
 */
public class RecipientsWarehouseOutModel {

    /**
     * 传公司主体，EBS根据公司主体确认其业务实体
     */
    private String                                purchaseCompanyCode;

    /**
     * 传领用单的申请日期
     */
    private Date                                  applyDate;

    /**
     * 申请人
     */
    private String                                applyUserName;

    /**
     * 领用说明
     */
    private String                                recipientsDescribe;

    /**
     * 领用单号
     */
    private String                                recipientsApplyCode;

    /**
     * 传领用单的外部单号（MO文件编号）
     */
    private String                                outsideNo;

    /**
     * 传申请人末级部门代码
     */
    private String                                organizationCode;

    /**
     * 出库行信息
     */
    private List<RecipientsItemWarehouseOutModel> itemParams;

    public String getPurchaseCompanyCode() {
        return purchaseCompanyCode;
    }

    public void setPurchaseCompanyCode(String purchaseCompanyCode) {
        this.purchaseCompanyCode = purchaseCompanyCode;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    public String getRecipientsDescribe() {
        return recipientsDescribe;
    }

    public void setRecipientsDescribe(String recipientsDescribe) {
        this.recipientsDescribe = recipientsDescribe;
    }

    public String getRecipientsApplyCode() {
        return recipientsApplyCode;
    }

    public void setRecipientsApplyCode(String recipientsApplyCode) {
        this.recipientsApplyCode = recipientsApplyCode;
    }

    public String getOutsideNo() {
        return outsideNo;
    }

    public void setOutsideNo(String outsideNo) {
        this.outsideNo = outsideNo;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public List<RecipientsItemWarehouseOutModel> getItemParams() {
        return itemParams;
    }

    public void setItemParams(List<RecipientsItemWarehouseOutModel> itemParams) {
        this.itemParams = itemParams;
    }
}
