package com.sunyur.api.channel.model.purchase;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>Copyright(c) 2019 Sunyur.com, All Rights Reserved.<p>
 *
 * <p>description  :  purchase apply item info</p>
 * <p>className    :  PurchaserApplyItemApiModel </p>
 * <p>create time  :  2019-08-28 11:38</p>
 * <p>@version     :  1.0</p>
 *
 * @author <p>     :  Gauler</p>
 **/
public class PurchaserApplyItemApiModel implements Serializable {

	private static final long serialVersionUID = 9524547200699887L;

	private Long itemId;
	/**
	 * 供应商code
	 */
	private String supplierCode;
	/**
	 * 供应商Id
	 */
	private Long supplierId;
	/**
	 * 供应商名称
	 */
	private String supplierName;
	/**
	 * 协议code
	 */
	private String protocolCode;
	/**
	 * 协议行code
	 */
	private String protocolItemCode;
	/**
	 * 采购属性
	 */
	private String purchaseAttribute;
	/**
	 * 商城商品Id
	 */
	private Long mallSKuId;
	/**
	 * 商城商品名称
	 */
	private String mallSKuName;
	/**
	 * 物料code
	 */
	private String materialCode;
	/**
	 * 物料名称
	 */
	private String materialName;
	/**
	 * 物料Id
	 */
	private Long materialId;
	/**
	 * 规格
	 */
	private String spec;
	/**
	 * 单位
	 */
	private String unit;
	/**
	 * 单位code
	 */
	private String unitCode;
	/**
	 * 采购数量
	 */
	private BigDecimal count;
	/**
	 * 品牌
	 */
	private String brand;
	/**
	 * 使用人组织code
	 */
	private String useOrgCode;
	/**
	 * 使用人组织id
	 */
	private Long useOrgId;
	/**
	 * 使用人组织名称
	 */
	private String useOrgName;
	/**
	 * 使用人姓名
	 */
	private String useName;
	/**
	 * 电话
	 */
	private String mobile;
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
	 * 状态
	 */
	private Integer status;
	/**
	 * 状态描述
	 */
	private String statusDesc;
	/**
	 * 物资采购类型 0 协议物料 1 非协议物料
	 */
	private Integer materialType;
	/**
	 * 参考价
	 */
	private BigDecimal referencePrice;
	/**
	 * 协议价
	 */
	private BigDecimal protocolPrice;
	/**
	 * 附件
	 */
	private ApiFileModel file;
	
	public Integer getMaterialType() {
		return materialType;
	}
	
	public void setMaterialType(Integer materialType) {
		this.materialType = materialType;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getProtocolCode() {
		return protocolCode;
	}

	public void setProtocolCode(String protocolCode) {
		this.protocolCode = protocolCode;
	}

	public String getProtocolItemCode() {
		return protocolItemCode;
	}

	public void setProtocolItemCode(String protocolItemCode) {
		this.protocolItemCode = protocolItemCode;
	}

	public String getPurchaseAttribute() {
		return purchaseAttribute;
	}

	public void setPurchaseAttribute(String purchaseAttribute) {
		this.purchaseAttribute = purchaseAttribute;
	}

	public Long getMallSKuId() {
		return mallSKuId;
	}

	public void setMallSKuId(Long mallSKuId) {
		this.mallSKuId = mallSKuId;
	}

	public String getMallSKuName() {
		return mallSKuName;
	}

	public void setMallSKuName(String mallSKuName) {
		this.mallSKuName = mallSKuName;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getUseOrgCode() {
		return useOrgCode;
	}

	public void setUseOrgCode(String useOrgCode) {
		this.useOrgCode = useOrgCode;
	}

	public String getUseOrgName() {
		return useOrgName;
	}

	public void setUseOrgName(String useOrgName) {
		this.useOrgName = useOrgName;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public BigDecimal getReferencePrice() {
		return referencePrice;
	}
	
	public void setReferencePrice(BigDecimal referencePrice) {
		this.referencePrice = referencePrice;
	}

	public BigDecimal getProtocolPrice() {
		return protocolPrice;
	}

	public void setProtocolPrice(BigDecimal protocolPrice) {
		this.protocolPrice = protocolPrice;
	}
	
	public Long getMaterialId() {
		return materialId;
	}
	
	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public Long getUseOrgId() {
		return useOrgId;
	}
	
	public void setUseOrgId(Long useOrgId) {
		this.useOrgId = useOrgId;
	}

	public ApiFileModel getFile() {
		return file;
	}

	public void setFile(ApiFileModel file) {
		this.file = file;
	}
}
