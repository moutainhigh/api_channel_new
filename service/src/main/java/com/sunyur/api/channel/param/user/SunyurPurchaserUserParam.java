package com.sunyur.api.channel.param.user;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description 用户入参
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/6/10 9:19 PM
 */
public class SunyurPurchaserUserParam implements Serializable {

    private static final long serialVersionUID = 2239912882808435469L;
    /**
     * 用户编码
     */
    @NotNull(message = "用户编码不能为空")
    private String code;

    /**
     * 用户姓名
     */
    @NotNull(message = "用户姓名不能为空")
    private String name;

    /**
     * 用户状态（0：无效，1：有效）
     */
    @NotNull(message = "用户状态不能为空")
    private Integer status;
    /**
     * 用户状态 0：未激活 1：正常 2：已停用 (长城之后启用此字段)
     */
    private Integer userStatus;
    /**
     * 1：职能 2：非职能
     */
    private Integer flag;
    /**
     * 用户外部组织code
     */
    private String orgCode;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 用户外部组织code
     */
    private String loginName;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 性别
     */
    private String sex;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 职务
     */
    private String position;
    /**
     * 删除标记 0 生效正常 1 删除 默认生效
     */
    private String isDeleted;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
}
