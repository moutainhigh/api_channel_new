package com.sunyur.api.channel.model.purchase;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * <p>Copyright(c) 2019 Sunyur.com, All Rights Reserved.<p>
 *
 * <p>description  :  purchase apply info api_web response</p>
 * <p>className    :  PurchaseApplyApiModel </p>
 * <p>create time  :  2019-08-28 11:38</p>
 * <p>@version     :  1.0</p>
 *
 * @author <p>     :  Gauler</p>
 **/
public class PurchaseApplyApiModel implements Serializable {

	private static final long serialVersionUID = 7753884609491295518L;
	/**
	 * 主键Id
	 */
	private Long id;
	/**
	 * 采购单code
	 */
	private String code;
	/**
	 * 请购单名称
	 */
	private String name;
	/**
	 * 申请人部门编码
	 */
	private String proposerOrgCode;
	/**
	 * 申请人部门名称
	 */
	private String proposerOrgName;
	/**
	 * 地址信息
	 */
	private String addressInfo;
	/**
	 * 申请人Id
	 */
	private String proposerId;
	/**
	 * 申请人code
	 */
	private String proposerCode;
	/**
	 * 申请人名称
	 */
	private String proposerName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 公司主体code
	 */
	private String purchaseCompanyCode;
	/**
	 * 公司名称
	 */
	private String purchaseCompanyName;
	/**
	 * 期望交货期
	 */
	private Date expectDelieyDate;
	/**
	 * 描述
	 */
	private String describe;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 主控部门code
	 */
	private String masterControlOrgCode;
	/**
	 * 主控部门名称
	 */
	private String masterControlOrgName;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 状态描述
	 */
	private String statusDesc;
	/**
	 * 采购属性
	 */
	private String purchaseAttribute;
	/**
	 * 采购属性值
	 */
	private String purchaseAttributeValue;
	/**
	 * 采购组织编码(申请单位)
	 */
	private String operatUnitCode;
	/**
	 * 采购组织名称(申请单位)
	 */
	private String operatUnitName;
	/**
	 * 收货单地址信息
	 */
	private PurchaserAddressModel receiveAddressInfo;
	/**
	 * 采购单行信息
	 */
	private List<PurchaserApplyItemApiModel> applyItem;
	/**
	 * 附件列表
	 */
	private List<ApiFileModel> files;

	/**
	 * 申请类型-对应sunyur存储字段名称为applyType
	 */
	private String type;

	/**
	 * 总金额
	 */
	private BigDecimal totalAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProposerOrgCode() {
		return proposerOrgCode;
	}

	public void setProposerOrgCode(String proposerOrgCode) {
		this.proposerOrgCode = proposerOrgCode;
	}

	public String getProposerOrgName() {
		return proposerOrgName;
	}

	public void setProposerOrgName(String proposerOrgName) {
		this.proposerOrgName = proposerOrgName;
	}

	public String getProposerId() {
		return proposerId;
	}

	public void setProposerId(String proposerId) {
		this.proposerId = proposerId;
	}

	public String getProposerCode() {
		return proposerCode;
	}

	public void setProposerCode(String proposerCode) {
		this.proposerCode = proposerCode;
	}

	public String getProposerName() {
		return proposerName;
	}

	public void setProposerName(String proposerName) {
		this.proposerName = proposerName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPurchaseCompanyCode() {
		return purchaseCompanyCode;
	}

	public void setPurchaseCompanyCode(String purchaseCompanyCode) {
		this.purchaseCompanyCode = purchaseCompanyCode;
	}

	public String getPurchaseCompanyName() {
		return purchaseCompanyName;
	}

	public void setPurchaseCompanyName(String purchaseCompanyName) {
		this.purchaseCompanyName = purchaseCompanyName;
	}

	public Date getExpectDelieyDate() {
		return expectDelieyDate;
	}

	public void setExpectDelieyDate(Date expectDelieyDate) {
		this.expectDelieyDate = expectDelieyDate;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getMasterControlOrgCode() {
		return masterControlOrgCode;
	}

	public void setMasterControlOrgCode(String masterControlOrgCode) {
		this.masterControlOrgCode = masterControlOrgCode;
	}

	public String getMasterControlOrgName() {
		return masterControlOrgName;
	}

	public void setMasterControlOrgName(String masterControlOrgName) {
		this.masterControlOrgName = masterControlOrgName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getPurchaseAttribute() {
		return purchaseAttribute;
	}

	public void setPurchaseAttribute(String purchaseAttribute) {
		this.purchaseAttribute = purchaseAttribute;
	}

	public String getPurchaseAttributeValue() {
		return purchaseAttributeValue;
	}

	public void setPurchaseAttributeValue(String purchaseAttributeValue) {
		this.purchaseAttributeValue = purchaseAttributeValue;
	}

	public String getOperatUnitCode() {
		return operatUnitCode;
	}

	public void setOperatUnitCode(String operatUnitCode) {
		this.operatUnitCode = operatUnitCode;
	}

	public String getOperatUnitName() {
		return operatUnitName;
	}

	public void setOperatUnitName(String operatUnitName) {
		this.operatUnitName = operatUnitName;
	}

	public PurchaserAddressModel getReceiveAddressInfo() {
		return receiveAddressInfo;
	}

	public void setReceiveAddressInfo(PurchaserAddressModel receiveAddressInfo) {
		this.receiveAddressInfo = receiveAddressInfo;
	}

	public List<PurchaserApplyItemApiModel> getApplyItem() {
		return applyItem;
	}

	public void setApplyItem(List<PurchaserApplyItemApiModel> applyItem) {
		this.applyItem = applyItem;
	}

	public List<ApiFileModel> getFiles() {
		return files;
	}

	public void setFiles(List<ApiFileModel> files) {
		this.files = files;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}
}
