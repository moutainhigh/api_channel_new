package com.sunyur.api.channel.param.materiel;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description  商越物料参数
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/27 11:11 AM
 */
public class SunyurMaterielParam implements Serializable {

    private static final long serialVersionUID = -6048621391645177707L;

    /**
     * 物料编码
     */
    @NotNull(message = "物料编码不可为空")
    private String            code;
    /**
     * 类目编码
     */
    @NotNull(message = "类目编码不可为空")
    private String            categoryCode;
    /**
     * 物料名称
     */
    @NotNull(message = "物料名称不可为空")
    private String            name;
    /**
     * 物料规格
     */
    private String            specification;
    /**
     * 物料单位
     */
    private String            unit;
    /**
     * 单位编码
     */
    private String            unitCode;
    /**
     * 物料备注
     */
    private String            remark;

    /**
     * 物料属性【暂时未使用】
     */
    private String            attributes;
    /**
     * 物料状态
     */
    @NotNull(message = "物料状态不可为空")
    private Integer           status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
