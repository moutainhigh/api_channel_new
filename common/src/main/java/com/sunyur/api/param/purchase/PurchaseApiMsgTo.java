/**
 * Copyright(c) 2004-2018 eaju.com, All Rights Reserved. Project: api_share Author: lishaochun Createdate: 上午10:32:07
 * Version: 1.0
 */
package com.sunyur.api.param.purchase;

import com.sunyur.api.param.common.ApiEventMsg;

/**
 * @Description:消息数据载体
 * @project api_share
 * @class PurchaseApiMsgTo.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年10月8日 下午8:08:22
 */
public class PurchaseApiMsgTo extends ApiEventMsg {

    private Long   id;

    private String code;

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

}
