package com.sunyur.api.channel.service.order;

import com.sunyur.api.channel.model.order.InvoiceOrderDetailModel;
import com.sunyur.api.channel.model.order.OrderDetailModel;
import com.sunyur.api.channel.model.order.OrderListModel;
import com.sunyur.api.channel.model.order.ReceiveOrderDetailModel;
import com.sunyur.api.channel.param.order.SunyurOrderUpdateReqParam;

import java.util.List;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/8/28 17:20
 */
public interface SunyurOrderService {

    ReceiveOrderDetailModel receiveOrderDetail(String code);

    InvoiceOrderDetailModel invoiceOrderDetail(String code);

    OrderDetailModel orderDetail(String code);

    List<OrderListModel> orderList(String count);

    Boolean updateList(List<SunyurOrderUpdateReqParam> updateReqParams);

}
