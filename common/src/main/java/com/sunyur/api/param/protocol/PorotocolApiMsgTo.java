package com.sunyur.api.param.protocol;

import com.sunyur.api.param.common.ApiEventMsg;

/**
 * @Description: api消息数据载体
 * @Author xujianhong
 * @Date 2019/10/21  17:47
 * @Version 1.0
 */
public class PorotocolApiMsgTo extends ApiEventMsg {

   private  Long  porotocolSerNumber;

   private Long   purchaserId;

   private  String  porotocolSerCode;

    public Long getPorotocolSerNumber() {
        return porotocolSerNumber;
    }

    public void setPorotocolSerNumber(Long porotocolSerNumber) {
        this.porotocolSerNumber = porotocolSerNumber;
    }

    public Long getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Long purchaserId) {
        this.purchaserId = purchaserId;
    }

    public String getPorotocolSerCode() {
        return porotocolSerCode;
    }

    public void setPorotocolSerCode(String porotocolSerCode) {
        this.porotocolSerCode = porotocolSerCode;
    }
}
