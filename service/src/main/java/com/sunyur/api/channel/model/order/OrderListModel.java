package com.sunyur.api.channel.model.order;

import java.util.List;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:订单列表编号
 * @date 2019/9/3 20:10
 */
public class OrderListModel {

    private String code;

    private List<OrderItemListModel> items;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<OrderItemListModel> getItems() {
        return items;
    }

    public void setItems(List<OrderItemListModel> items) {
        this.items = items;
    }
}
