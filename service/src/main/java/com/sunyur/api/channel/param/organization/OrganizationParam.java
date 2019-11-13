package com.sunyur.api.channel.param.organization;

import java.io.Serializable;

/**
 * @Description 商越组织入参
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/6/10 5:37 PM
 */
public class OrganizationParam implements Serializable {

    private static final long serialVersionUID = 4999442891372856662L;

    /**
     * 组织父ID
     */
    private Long              parentId;
    /**
     * 租户id
     */
    private Long              purchaseId;
    /**
     * 组织名称
     */
    private String            orgName;

    /**
     * 外部组织code
     */
    private String            orgCode;
    /**
     * 外部组织父级code
     */
    private String            parentCode;
    /**
     * 描述
     */
    private String            description;
    /**
     * 级别 {0:部门级,1:公司级}
     */
    private Integer			  orgType;
    /**
     * 是否采购实体
     */
    private Boolean			  isCompany;
    /**
     * 操作用户
     */
    private Long              operatorCode;
    /**
     * 公司采购主体id
     */
    private Long              purchaserCompanyId;
    /**
     * 公司code
     */
    private String            companyCode;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public Boolean getCompany() {
        return isCompany;
    }

    public void setCompany(Boolean company) {
        isCompany = company;
    }

    public Long getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(Long operatorCode) {
        this.operatorCode = operatorCode;
    }

    public Long getPurchaserCompanyId() {
        return purchaserCompanyId;
    }

    public void setPurchaserCompanyId(Long purchaserCompanyId) {
        this.purchaserCompanyId = purchaserCompanyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
