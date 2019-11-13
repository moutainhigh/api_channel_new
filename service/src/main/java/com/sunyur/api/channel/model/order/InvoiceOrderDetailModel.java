package com.sunyur.api.channel.model.order;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/8/28 17:59
 */
public class InvoiceOrderDetailModel {

    // 发票单编号
    private String code;
    // 发票类型
    private Integer type;
    // 增值税类型
    private Integer vatType;
    // 支付类型
    private Integer payType;
    // 支付周期（账期）
    private Integer payPeriod;
    // 供应商编号
    private String supplierCode;
    // 含税总金额
    private BigDecimal taxIncludedAmount;
    // 未含税总金额
    private BigDecimal taxExcludedAmount;
    // 币种
    private String currency;
    // 采购员编号
    private String agentCode;
    // 采购员名称
    private String agentName;
    // 税务发票号
    private String taxCodes;
    // 发票税额
    private BigDecimal taxAmount;
    // 未含税总金额
    private BigDecimal untaxedAmount;
    // 发票总额
    private BigDecimal amount;
    // 实际发票税额
    private BigDecimal taxRealAmount;
    // 实际未含税总金额
    private BigDecimal realUntaxedAmount;
    // 实际发票总额
    private BigDecimal realAmount;
    // 创建时间
    private Date createTime;
    // 创建人
    private String creatorCode;
    // 确认时间
    private Date confirmTime;
    // 确认人
    private String confirmerCode;
    // 备注
    private String remark;
    // 企业主体编码
    private String companyCode;
    // 申请单位组织编码
    private String settleCompanyCode;
    // 企业主体名称
    private String companyName;
    /**
     * 收票人信息
     */
    // 收票地址编号
    private String receiverAddressCode;
    // 收票人地址
    private String receiverAddress;
    // 收票人编号
    private String receiverUserCode;
    // 收票人名称
    private String receiverName;
    // 收票人手机号
    private String receiverMobile;
    /**
     * 发票信息
     */
    // 发票纳税人识别号
    private String invoiceTaxpayerCode;
    // 发票开户行
    private String invoiceBank;
    // 发票银行账户
    private String invoiceBankAccount;
    // 发票电话
    private String invoiceMobile;
    // 发票地址
    private String invoiceAddress;
    // 发票单行信息
    private List<InvoiceOrderItemDetailModel> items;

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

    public Integer getVatType() {
        return vatType;
    }

    public void setVatType(Integer vatType) {
        this.vatType = vatType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(Integer payPeriod) {
        this.payPeriod = payPeriod;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getTaxCodes() {
        return taxCodes;
    }

    public void setTaxCodes(String taxCodes) {
        this.taxCodes = taxCodes;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getUntaxedAmount() {
        return untaxedAmount;
    }

    public void setUntaxedAmount(BigDecimal untaxedAmount) {
        this.untaxedAmount = untaxedAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTaxRealAmount() {
        return taxRealAmount;
    }

    public void setTaxRealAmount(BigDecimal taxRealAmount) {
        this.taxRealAmount = taxRealAmount;
    }

    public BigDecimal getRealUntaxedAmount() {
        return realUntaxedAmount;
    }

    public void setRealUntaxedAmount(BigDecimal realUntaxedAmount) {
        this.realUntaxedAmount = realUntaxedAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorCode() {
        return creatorCode;
    }

    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getConfirmerCode() {
        return confirmerCode;
    }

    public void setConfirmerCode(String confirmerCode) {
        this.confirmerCode = confirmerCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getSettleCompanyCode() {
        return settleCompanyCode;
    }

    public void setSettleCompanyCode(String settleCompanyCode) {
        this.settleCompanyCode = settleCompanyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getReceiverAddressCode() {
        return receiverAddressCode;
    }

    public void setReceiverAddressCode(String receiverAddressCode) {
        this.receiverAddressCode = receiverAddressCode;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverUserCode() {
        return receiverUserCode;
    }

    public void setReceiverUserCode(String receiverUserCode) {
        this.receiverUserCode = receiverUserCode;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getInvoiceTaxpayerCode() {
        return invoiceTaxpayerCode;
    }

    public void setInvoiceTaxpayerCode(String invoiceTaxpayerCode) {
        this.invoiceTaxpayerCode = invoiceTaxpayerCode;
    }

    public String getInvoiceBank() {
        return invoiceBank;
    }

    public void setInvoiceBank(String invoiceBank) {
        this.invoiceBank = invoiceBank;
    }

    public String getInvoiceBankAccount() {
        return invoiceBankAccount;
    }

    public void setInvoiceBankAccount(String invoiceBankAccount) {
        this.invoiceBankAccount = invoiceBankAccount;
    }

    public String getInvoiceMobile() {
        return invoiceMobile;
    }

    public void setInvoiceMobile(String invoiceMobile) {
        this.invoiceMobile = invoiceMobile;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public List<InvoiceOrderItemDetailModel> getItems() {
        return items;
    }

    public void setItems(List<InvoiceOrderItemDetailModel> items) {
        this.items = items;
    }
}
