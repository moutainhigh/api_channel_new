package com.sunyur.api.channel.service.order.impl;

import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.base.ModelResultUtil;
import com.sunyur.api.channel.common.httpclient.ApiHttpClient;
import com.sunyur.api.channel.model.order.*;
import com.sunyur.api.channel.model.purchase.PurchaseApplyApiModel;
import com.sunyur.api.channel.param.order.SunyurOrderDetailReqParam;
import com.sunyur.api.channel.param.order.SunyurOrderInvoiceReqParam;
import com.sunyur.api.channel.param.order.SunyurOrderReceiveReqParam;
import com.sunyur.api.channel.param.order.SunyurOrderUpdateReqParam;
import com.sunyur.api.channel.service.order.SunyurOrderService;
import com.sunyur.api.channel.service.organization.impl.SunyurOrganizationServiceImpl;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/8/28 17:20
 */
@Service("sunyurOrderService")
public class SunyurOrderServiceImpl implements SunyurOrderService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(SunyurOrganizationServiceImpl.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(SunyurOrganizationServiceImpl.class);

    @Autowired
    private HttpClient httpClient;

    @Value("${remote.api.receive.detail.http}")
    private String receiveDetailHttp;

    @Value("${remote.api.invoice.detail.http}")
    private String invoiceDetailHttp;

    @Value("${remote.api.order.detail.http}")
    private String orderDetailHttp;

    @Value("${remote.api.order.list.http}")
    private String invoiceListHttp;

    @Value("${remote.api.order.update.http}")
    private String orderUpdateHttp;

    @Value("${remote.api.base.http}")
    private String baseUrl;

    @Value("${app_key}")
    private String appkey;

    @Value("${app_secret}")
    private String appSecret;

    /**
     * @Description 查询收货单详情
     * @Author jianqiao.dong
     * @Version 0.2
     * @Date 2019/8/28
     **/
    @Override
    public ReceiveOrderDetailModel receiveOrderDetail(String code) {
        LOGGER_INFO.info("SunyurOrderService.receiveOrderDetail param is {} ", JSON.toJSONString(code));

        try {

            SunyurOrderReceiveReqParam param = new SunyurOrderReceiveReqParam();
            param.setCode(code);
            ModelResult<ReceiveOrderDetailModel> result = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, baseUrl, receiveDetailHttp, JSON.toJSONString(param));
            LOGGER_INFO.info("SunyurOrderService.receiveOrderDetail result is {}", JSON.toJSONString(result));

            if (!ModelResultUtil.isSuccess(result)) {
                return null;
            }

            return JSON.parseObject(JSON.toJSONString(result.getContent()),ReceiveOrderDetailModel.class);

        } catch (Exception e) {
            LOGGER_ERROR.error("SunyurOrderService.receiveOrderDetail exception {}", e);
        }
        return null;
    }

    /**
     * @Description 查询发票单详情
     * @Author jianqiao.dong
     * @Version 0.2
     * @Date 2019/8/28
     **/
    @Override
    public InvoiceOrderDetailModel invoiceOrderDetail(String code) {
        LOGGER_INFO.info("SunyurOrderService.invoiceOrderDetail param is {} ", JSON.toJSONString(code));

        try {

            SunyurOrderInvoiceReqParam param = new SunyurOrderInvoiceReqParam();
            param.setCode(code);

            ModelResult<InvoiceOrderDetailModel> result = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, baseUrl, invoiceDetailHttp, JSON.toJSONString(param));
            LOGGER_INFO.info("SunyurOrderService.invoiceOrderDetail result is {}", JSON.toJSONString(result));

            if (!ModelResultUtil.isSuccess(result)) {
                return null;
            }
            return JSON.parseObject(JSON.toJSONString(result.getContent()), InvoiceOrderDetailModel.class);

        } catch (Exception e) {
            LOGGER_ERROR.error("SunyurOrderService.invoiceOrderDetail exception {}", e);
        }
        return null;
    }

    @Override
    public OrderDetailModel orderDetail(String code) {

        LOGGER_INFO.info("SunyurOrderService.orderDetail param is {} ", JSON.toJSONString(code));

        try {
            SunyurOrderDetailReqParam param = new SunyurOrderDetailReqParam();
            param.setCode(code);
            ModelResult<OrderDetailModel> result = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, baseUrl, orderDetailHttp, JSON.toJSONString(param));
            LOGGER_INFO.info("SunyurOrderService.orderDetail result is {}", JSON.toJSONString(result));

            if (!ModelResultUtil.isSuccess(result)) {
                return null;
            }

            return JSON.parseObject(JSON.toJSONString(result.getContent()),OrderDetailModel.class);
        } catch (Exception e) {
            LOGGER_ERROR.error("SunyurOrderService.orderDetail exception {}", e);
        }
        return null;
    }

    @Override
    public List<OrderListModel> orderList(String count) {

        try {
            String newUrl = invoiceListHttp + "?count=" +count;
            ModelResult<List<OrderListModel>> result = ApiHttpClient.getInstance(appkey, appSecret).execGet(httpClient, baseUrl, newUrl,count);
            LOGGER_INFO.info("SunyurOrderService.orderList result is {}", JSON.toJSONString(result));

            if (!ModelResultUtil.isSuccess(result)) {
                return null;
            }
            return JSON.parseArray(JSON.toJSONString(result.getContent()),OrderListModel.class);

        } catch (Exception e) {
            LOGGER_ERROR.error("SunyurOrderService.orderList exception {}", e);
        }
        return null;
    }

    @Override
    public Boolean updateList(List<SunyurOrderUpdateReqParam> updateReqParams) {

        String requestBody = JSON.toJSONString(updateReqParams);
        LOGGER_INFO.info("SunyurOrderService.orderDetail param is {} ", requestBody);

        try {
            ModelResult<Boolean> result = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, baseUrl, orderUpdateHttp, requestBody);
            LOGGER_INFO.info("SunyurOrderService.updateList result is {}", JSON.toJSONString(result));

            if (!ModelResultUtil.isSuccess(result)) {
                return null;
            }
            return result.getContent();
        } catch (Exception e) {
            LOGGER_ERROR.error("SunyurOrderService.updateList exception {}", e);
        }
        return false;
    }
}
