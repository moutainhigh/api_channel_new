package com.sunyur.api.channel.model.organization;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 商越返回org
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/11/11 3:52 PM
 */
public class OrganizationModel implements Serializable {

    private static final long serialVersionUID = 7276773756112427302L;
    /**
     * 组织名称
     */
    private String            name;
    /**
     * 组织code
     */
    private String            code;
    /**
     * 组织外部code
     */
    private String            customCode;
    /**
     * 组织描述
     */
    private String            description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 组织排序
     */
    private Long 			  sort;
    /**
     * 组织类型 0 普通组织 1 公司级组织
     */
    private Integer			  type;
    /**
     * 公司主体
     */
    private Long			  purchaserCompanyId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getPurchaserCompanyId() {
        return purchaserCompanyId;
    }

    public void setPurchaserCompanyId(Long purchaserCompanyId) {
        this.purchaserCompanyId = purchaserCompanyId;
    }
}
