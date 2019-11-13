package com.sunyur.api.channel.model.protocol;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description:协议价格model
 * @Author xujianhong
 * @Date 2019/09/23  17:03
 * @Version 1.0
 */
public class PriceRuleModel implements Serializable {

    private static final long serialVersionUID = -4047005490477280225L;

    private Long              id;
    /**
     * 起定量
     */
    private BigDecimal startQuantity;

    /**
     * 结至定量
     */
    private BigDecimal           endQuantity;

    /**
     * 阶梯起订量
     */
    private BigDecimal        startStepQuantity;

    /**
     * 阶梯截止量
     */
    private BigDecimal        endStepQuantity;

    /**
     * 协议价(含税)
     */
    private BigDecimal        price;

    /**
     * 参考价
     */
    private BigDecimal      referencePrice;
    /**
     * 市场价
     */
    private BigDecimal     marketPrice;

    /**
     * 价格规则
     */
    private Integer           priceType;

    /**
     * 折扣率
     */
    private BigDecimal        discountRate;

    /**
     * 描述
     */
    private String            describeMsg;

    /**
     * 税点
     */
    private BigDecimal        taxPoint;

    /**
     * 税code
     */
    private String            taxCode;

    private Integer           isDeleted;

    /**
     * 未税价
     */
    private BigDecimal        untaxedPrice;

    private Long              creator;

    private Date createTime;

    private Long              modifier;

    private Date              modifyTime;
    /**
     *
     */
    private Long              purchaserId;
    /**
     * 协议行ID
     */
    private Long              protocolItemId;

    public Long getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Long purchaserId) {
        this.purchaserId = purchaserId;
    }

    public Long getProtocolItemId() {
        return protocolItemId;
    }

    public void setProtocolItemId(Long protocolItemId) {
        this.protocolItemId = protocolItemId;
    }

    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(BigDecimal referencePrice) {
        this.referencePrice = referencePrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public BigDecimal getStartStepQuantity() {
        return startStepQuantity;
    }

    public void setStartStepQuantity(BigDecimal startStepQuantity) {
        this.startStepQuantity = startStepQuantity;
    }

    public BigDecimal getEndStepQuantity() {
        return endStepQuantity;
    }

    public void setEndStepQuantity(BigDecimal endStepQuantity) {
        this.endStepQuantity = endStepQuantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public String getDescribeMsg() {
        return describeMsg;
    }

    public void setDescribeMsg(String describeMsg) {
        this.describeMsg = describeMsg;
    }

    public BigDecimal getTaxPoint() {
        return taxPoint;
    }

    public void setTaxPoint(BigDecimal taxPoint) {
        this.taxPoint = taxPoint;
    }

    public BigDecimal getUntaxedPrice() {
        return untaxedPrice;
    }

    public void setUntaxedPrice(BigDecimal untaxedPrice) {
        this.untaxedPrice = untaxedPrice;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public BigDecimal getStartQuantity() {
        return startQuantity;
    }

    public void setStartQuantity(BigDecimal startQuantity) {
        this.startQuantity = startQuantity;
    }

    public BigDecimal getEndQuantity() {
        return endQuantity;
    }

    public void setEndQuantity(BigDecimal endQuantity) {
        this.endQuantity = endQuantity;
    }
}
