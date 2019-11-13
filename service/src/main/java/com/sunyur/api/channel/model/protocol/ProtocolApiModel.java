package com.sunyur.api.channel.model.protocol;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Description: 协议头model
 * @Author xujianhong
 * @Date 2019/09/23  16:57
 * @Version 1.0
 */
public class ProtocolApiModel implements Serializable {

    private static final long serialVersionUID = 34211491295518L;
    /**
     *  协议编号
     */
    private String  protocolCode;

    /**
     *  协议名称
     */
    private String  name;

    /**
     *  公司主体
     */
    private String  companySubject;

    /**
     *  供应商名称
     */
    private String  supplierName;

    /**
     *  有效期开始时间
     */
    private Date protocolValidityBegin;

    /**
     *  有效期结束时间
     */
    private Date  protocolValidityEnd;

    /**
     *  账期
     */
    private Integer  accountPeriod;

    /**
     *  账期类型
     */
    private Integer accountPeriodType;

    /**
     *  结算周期（如：1周结、2月结、3季度结、4合成结算）
     */
    private Integer  settlementCycle;

    /**
     * 付款方式(如：1银行转账、2电汇、3现金，4支票等数据字典中取)
     */
    private Integer  paymentMethod;
    /**
     *  发票类型
     */
    private Integer  invoiceType;


    private List<ProtocolItemApiModel> itemCheckVOList;

    /**
     * 采购组织名称
     */
    private String orgName;

    /**
     *  备注
     */
    private  String  remark;

    /**
     *  协议附件
     */
    private String  protocolTextUrl;

    /**
     *  创建人code
     */
    private String creatorCode;

    /**
     *  业务模式
     */
    private Integer businessType;

    private String serialNumber;

    private Double  protocolVersion;


    public String getProtocolCode() {
        return protocolCode;
    }

    public void setProtocolCode(String protocolCode) {
        this.protocolCode = protocolCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanySubject() {
        return companySubject;
    }

    public void setCompanySubject(String companySubject) {
        this.companySubject = companySubject;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Date getProtocolValidityBegin() {
        return protocolValidityBegin;
    }

    public void setProtocolValidityBegin(Date protocolValidityBegin) {
        this.protocolValidityBegin = protocolValidityBegin;
    }

    public Date getProtocolValidityEnd() {
        return protocolValidityEnd;
    }

    public void setProtocolValidityEnd(Date protocolValidityEnd) {
        this.protocolValidityEnd = protocolValidityEnd;
    }

    public Integer getAccountPeriod() {
        return accountPeriod;
    }

    public void setAccountPeriod(Integer accountPeriod) {
        this.accountPeriod = accountPeriod;
    }

    public Integer getAccountPeriodType() {
        return accountPeriodType;
    }

    public void setAccountPeriodType(Integer accountPeriodType) {
        this.accountPeriodType = accountPeriodType;
    }

    public Integer getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(Integer settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public List<ProtocolItemApiModel> getItemCheckVOList() {
        return itemCheckVOList;
    }

    public void setItemCheckVOList(List<ProtocolItemApiModel> itemCheckVOList) {
        this.itemCheckVOList = itemCheckVOList;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProtocolTextUrl() {
        return protocolTextUrl;
    }

    public void setProtocolTextUrl(String protocolTextUrl) {
        this.protocolTextUrl = protocolTextUrl;
    }

    public String getCreatorCode() {
        return creatorCode;
    }

    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(Double protocolVersion) {
        this.protocolVersion = protocolVersion;
    }
}
