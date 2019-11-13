package com.sunyur.api.channel.param.order;

import java.util.List;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 21:20
 */
public class SunyurOrderUpdateReqParam {

    // 订单号
    private String code;
    // EBS订单号
    private String purCode;
    // 行信息
    private List<SunyurOrderUpdateItemReqParam> items;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPurCode() {
        return purCode;
    }

    public void setPurCode(String purCode) {
        this.purCode = purCode;
    }

    public List<SunyurOrderUpdateItemReqParam> getItems() {
        return items;
    }

    public void setItems(List<SunyurOrderUpdateItemReqParam> items) {
        this.items = items;
    }
}
