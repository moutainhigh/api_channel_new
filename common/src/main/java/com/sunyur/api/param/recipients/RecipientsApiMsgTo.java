/**
 * Copyright(c) 2004-2018 eaju.com, All Rights Reserved. Project: api_share Author: lishaochun Createdate: 上午10:32:07
 * Version: 1.0
 */
package com.sunyur.api.param.recipients;

import com.sunyur.api.param.common.ApiEventMsg;

/**
 * @Description:领用 api消息数据载体
 * @project api_share
 * @class RecipientsApiMsg.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年9月27日 上午10:32:07
 */
public class RecipientsApiMsgTo extends ApiEventMsg{

    private Long          id;

    private Long          purchaserId;

    /** 领用编号 */
    private String        recipientsCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipientsCode() {
        return recipientsCode;
    }

    public void setRecipientsCode(String recipientsCode) {
        this.recipientsCode = recipientsCode;
    }

    public Long getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Long purchaserId) {
        this.purchaserId = purchaserId;
    }
}
