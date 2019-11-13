/**
 * Copyright(c) 2004-2018 eaju.com, All Rights Reserved. Project: api_share Author: lishaochun Createdate: 上午11:51:55
 * Version: 1.0
 */
package com.sunyur.api.channel.model.purchase;

import java.util.Date;
import java.util.List;

/**
 * @Description:mo头信息
 * @project api_share
 * @class RecipientsApplyApiModel.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年9月27日 上午11:51:55
 */
public class RecipientsSubmitMoInfoModel {

    /**
     * 领用单编号
     */
    private String                          recipientsApplyCode;

    /**
     * 申请人用户的工号
     */
    private String                          startUserAccount;

    /**
     * 申请部门 取二、三级、四级部门，用短横杠链接，如事业部-系统-部门
     */
    private String                          userOrganizationCode;

    /**
     * 申请人
     */
    private String                          applyUserName;

    /**
     * 手机号
     */
    private String                          phone;

    /**
     * 申请时间
     */
    private Date                            applyDate;

    /**
     * 传公司主体，EBS根据公司主体确认其业务实体
     */
    private String                          purchaseCompanyName;

    /**
     * 仓库
     */
    private String                          supplierName;

    /**
     * 领用说明
     */
    private String                          recipientsDescribe;

    /**
     * 行信息
     */
    private List<RecipientsMoItemInfoModel> items;

    public List<RecipientsMoItemInfoModel> getItems() {
        return items;
    }

    public void setItems(List<RecipientsMoItemInfoModel> items) {
        this.items = items;
    }

    public String getStartUserAccount() {
        return startUserAccount;
    }

    public void setStartUserAccount(String startUserAccount) {
        this.startUserAccount = startUserAccount;
    }

    public String getUserOrganizationCode() {
        return userOrganizationCode;
    }

    public void setUserOrganizationCode(String userOrganizationCode) {
        this.userOrganizationCode = userOrganizationCode;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getPurchaseCompanyName() {
        return purchaseCompanyName;
    }

    public void setPurchaseCompanyName(String purchaseCompanyName) {
        this.purchaseCompanyName = purchaseCompanyName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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
}
