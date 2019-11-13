package com.sunyur.api.channel.service.purchase.impl;


import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.httpclient.ApiHttpClient;
import com.sunyur.api.channel.model.purchase.RecipientsSubmitMoInfoModel;
import com.sunyur.api.channel.model.purchase.RecipientsWarehouseOutModel;
import com.sunyur.api.channel.service.purchase.SunyurRecipientsService;

import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description:领用前置机处理
 * @project service
 * @class OppoRecipientsServiceImpl.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年9月27日 下午3:23:43
 */
@Service("sunyurRecipientsService")
public class SunyurRecipientsServiceImpl implements SunyurRecipientsService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(SunyurRecipientsServiceImpl.class);

    @Value("${remote.api.base.http}")
    private String sunyurBaseUrl;
    @Value("${app_key}")
    private String appkey;
    @Value("${app_secret}")
    private String appSecret;
    @Value("${remote.api.recipients.get.http}")
    private String recipientsGetPath;
    @Value("${remote.api.recipients.get.warehouse.out.http}")
    private String warehouseOutApiPath;

    @Autowired
    private HttpClient httpClient;

    @Override
    @SuppressWarnings("unchecked")
    public ModelResult<RecipientsSubmitMoInfoModel> getSubmitInfoByApi(long id) {
        LOGGER_INFO.info("getRecipientsApplyInfoFromApi id:{} ", id);

        ModelResult<RecipientsSubmitMoInfoModel> result = null;
        try {
            String restUrl = recipientsGetPath + "/" + id;
            result = ApiHttpClient.getInstance(appkey, appSecret).execGet(httpClient, sunyurBaseUrl, restUrl, String.valueOf(id));
            LOGGER_INFO.info("getRecipientsApplyInfoFromApi result:{}", JSON.toJSONString(result));
        } catch (Exception e) {
            LOGGER_INFO.info("SunyurOrderService.orderDetail exception {}", e);
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ModelResult<RecipientsWarehouseOutModel> getWarehouseOutInfoByApi(long id) {
        LOGGER_INFO.info("getWarehouseOutInfoByApi id:{} ", id);
        ModelResult<RecipientsWarehouseOutModel> result = new ModelResult<>();
        try {
            String restUrl = warehouseOutApiPath + "/" + id;
            ModelResult<RecipientsWarehouseOutModel> httpResult = ApiHttpClient.getInstance(appkey, appSecret).execGet(httpClient, sunyurBaseUrl, restUrl, String.valueOf(id));
            RecipientsWarehouseOutModel content = JSON.parseObject(JSON.toJSONString(httpResult.getContent()), RecipientsWarehouseOutModel.class);
            result.setContent(content);
            LOGGER_INFO.info("getWarehouseOutInfoByApi result:{}", JSON.toJSONString(result));
        } catch (Exception e) {
            LOGGER_INFO.info("getWarehouseOutInfoByApi exception {}", e);
        }

        return result;
    }
}
