package com.sunyur.api.channel.common.base;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @Description:操作结果基类
 * @author houzi
 * @date May 21, 2019 3:44:58 PM
 */
public class ResultSet implements Serializable {

    private static final long serialVersionUID = 2596006438989201663L;
    /**
     * 错误信息־
     */
    private String            errorMessage;
    /**
     * 信息码
     */
    private String            code             = "";
    /**
     * 成功标示
     */
    private static String     SUCCESS          = "success";

    /**
     * @Description:操作是否成功 1.true成功 2.false失败
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:27:26
     * @return
     */
    public boolean isSuccess() {
        return SUCCESS.equals(getCode());
    }

    /**
     * @Description:获取错误信息
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:27:26
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @Description:设置信息码和信息
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:27:26
     * @param code
     * @param errorMessage
     */
    public void setErrorMessage(String code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }

    /**
     * @Description:获取信息码
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:27:26
     * @return
     */
    public String getCode() {
        return StringUtils.isBlank(code) ? SUCCESS : code;
    }

    /**
     * @Description:输出属性和值
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:27:26
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public ResultSet(String errorMessage, String code) {
        this.errorMessage = errorMessage;
        this.code = code;
    }

    public ResultSet(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ResultSet() {
    }
}
