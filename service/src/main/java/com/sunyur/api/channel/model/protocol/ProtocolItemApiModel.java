package com.sunyur.api.channel.model.protocol;
import java.io.Serializable;
import java.util.List;

/**
 * @Description: 协议行Model
 * @Author xujianhong
 * @Date 2019/09/23   16:59
 * @Version 1.0
 */
public class ProtocolItemApiModel implements Serializable {

    private static final long              serialVersionUID = -51221423014222189L;

    private Long                           id;

    /**
     * 协议ID
     */
    private Long                           protocolId;

    /**
     * 采购商编号
     */
    private Long                           purchaseId;

    /**
     * 供应商编号
     */
    private Long                           supplierId;

    /**
     * 系统生成协议code
     */
    private String                         protocolItemCode;

    /**
     * 流水号
     */
    private String                         serialNumber;

    /**
     * 价格类型(1:单一价格、2:单订单阶梯价、3:累计阶梯价)
     */
    private Integer                        priceType;

    /**
     * 物料id
     */
    private Long                           materielId;

    /**
     * 物料编号
     */
    private String                         materielCode;

    /**
     * 商品说明
     */
    private String                         materielDesc;

    /**
     * 物料名称
     */
    private String                         materielName;

    /**
     * 计量单位
     */
    private String                         unitName;

    /**
     * 单位code
     */
    private String                         unitCode;

    /**
     * 所属分类
     */
    private Long                           categoryId;

    /**
     * 分类名称
     */
    private String                         categoryName;

    /**
     * 分类编码
     */
    private String                         categoryCode;

    /**
     * 采购数上限
     */
    private Integer                        quantityUpperLimit;

    /**
     * 采购额上限
     */
    private Integer                        amountUpperLimit;

    /**
     * 交期(天)
     */
    private Integer                        deliveryDate;


    /**
     * 价格规则
     */
    private List<PriceRuleModel> priceRuleList;

    public String getMaterielName() {
        return materielName;
    }

    public void setMaterielName(String materielName) {
        this.materielName = materielName;
    }

    public List<PriceRuleModel> getPriceRuleList() {
        return priceRuleList;
    }

    public void setPriceRuleList(List<PriceRuleModel> priceRuleList) {
        this.priceRuleList = priceRuleList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getProtocolItemCode() {
        return protocolItemCode;
    }

    public void setProtocolItemCode(String protocolItemCode) {
        this.protocolItemCode = protocolItemCode;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public Long getMaterielId() {
        return materielId;
    }

    public void setMaterielId(Long materielId) {
        this.materielId = materielId;
    }

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    public String getMaterielDesc() {
        return materielDesc;
    }

    public void setMaterielDesc(String materielDesc) {
        this.materielDesc = materielDesc;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Integer getQuantityUpperLimit() {
        return quantityUpperLimit;
    }

    public void setQuantityUpperLimit(Integer quantityUpperLimit) {
        this.quantityUpperLimit = quantityUpperLimit;
    }

    public Integer getAmountUpperLimit() {
        return amountUpperLimit;
    }

    public void setAmountUpperLimit(Integer amountUpperLimit) {
        this.amountUpperLimit = amountUpperLimit;
    }

    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}
