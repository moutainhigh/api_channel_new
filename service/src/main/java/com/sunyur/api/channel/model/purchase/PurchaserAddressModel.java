package com.sunyur.api.channel.model.purchase;

import java.io.Serializable;

/**
 * <p>Copyright(c) 2019 Sunyur.com, All Rights Reserved.<p>
 *
 * <p>description  :  address info</p>
 * <p>className    :  PurchaserAddressModel </p>
 * <p>create time  :  2019-08-28 11:38</p>
 * <p>@version     :  1.0</p>
 *
 * @author <p>     :  Gauler</p>
 **/
public class PurchaserAddressModel implements Serializable {

    private static final long serialVersionUID = 8708555279772030027L;

    /**
     * 主键id
     */
    private Long id;
    /**
     * 接收者名称
     */
    private String recipientUserName;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 地址简称
     */
    private String addressShortName;
    /**
     * 省
     */
    private String provinceCode;
    /**
     * 省
     */
    private String provinceName;
    /**
     * 市
     */
    private String cityCode;
    /**
     * 市
     */
    private String cityName;
    /**
     * 区
     */
    private String areaCode;
    /**
     * 区
     */
    private String areaName;
    /**
     * 街道
     */
    private String streetCode;
    /**
     * 街道
     */
    private String streetName;
    /**
     * 详细地址
     */
    private String addressInfo;
    /**
     * 所属类型{0:公司, 1:个人}
     */
    private Integer type;
    /**
     * 所属类型为1时的userId
     */
    private Long owner;
    /**
     * 是否默认地址 0 默认地址 1 非默认
     */
    private  Integer isDefaultAddress;
    /**
     * 邮政编码
     */
    private  String postalCode;
    /**
     * 省市区街道拼成的详细地址
     */
    private  String addressDetailInfo;
    /**
     * 外部code
     */
    private String outsideCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipientUserName() {
        return recipientUserName;
    }

    public void setRecipientUserName(String recipientUserName) {
        this.recipientUserName = recipientUserName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddressShortName() {
        return addressShortName;
    }

    public void setAddressShortName(String addressShortName) {
        this.addressShortName = addressShortName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    public Integer getIsDefaultAddress() {
        return isDefaultAddress;
    }

    public void setIsDefaultAddress(Integer isDefaultAddress) {
        this.isDefaultAddress = isDefaultAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddressDetailInfo() {
        return addressDetailInfo;
    }

    public void setAddressDetailInfo(String addressDetailInfo) {
        this.addressDetailInfo = addressDetailInfo;
    }
    public String getOutsideCode() {
		return outsideCode;
	}
    
    public void setOutsideCode(String outsideCode) {
		this.outsideCode = outsideCode;
	}
}
