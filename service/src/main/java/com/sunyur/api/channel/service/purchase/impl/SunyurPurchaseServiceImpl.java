package com.sunyur.api.channel.service.purchase.impl;

import com.sunyur.api.channel.service.purchase.SunyurPurchaseService;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.base.ModelResultUtil;
import com.sunyur.api.channel.common.httpclient.ApiHttpClient;
import com.sunyur.api.channel.model.purchase.PurchaseApplyApiModel;

/**
 * <p>Copyright(c) 2019 Sunyur.com, All Rights Reserved.<p>
 *
 * <p>description  :  service implement of OppoPurchaseService</p>
 * <p>className    :  OppoPurchaseServiceImpl </p>
 * <p>create time  :  2019-08-28 11:41</p>
 * <p>@version     :  1.0</p>
 *
 * @author <p>     :  Gauler</p>
 **/
@Service("sunyurPurchaseService")
public class SunyurPurchaseServiceImpl implements SunyurPurchaseService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(SunyurPurchaseServiceImpl.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(SunyurPurchaseServiceImpl.class);


    @Value("${remote.api.base.http}")
    private String sunyurBaseUrl;

    @Value("${remote.api.purchase.get.http}")
    private String purchaseGetPath;

    @Value("${app_key}")
    private String appkey;
    @Value("${app_secret}")
    private String appSecret;

    @Autowired
    private HttpClient httpClient;
    /**
     * {@inheritDoc}
     *
     * @param purchaseApplyCode     purchaseApplyCode
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public PurchaseApplyApiModel getPurchaseApplyInfoFromApi(String purchaseApplyCode) {
        LOGGER_INFO.info("getPurchaseApplyInfoFromApi, input purchaseApplyCode : {}", purchaseApplyCode);
        try {
            String newUrl = purchaseGetPath + "?code=" +purchaseApplyCode;
            ModelResult<PurchaseApplyApiModel> applyInfo = ApiHttpClient.getInstance(appkey, appSecret).execGet(httpClient, sunyurBaseUrl, newUrl, purchaseApplyCode);
            LOGGER_INFO.info("call api for getting purchase info : {}", JSON.toJSONString(applyInfo));
            if (!ModelResultUtil.isSuccess(applyInfo)) {
                return null;
            }

            PurchaseApplyApiModel purchaseApplyApiModel = JSON.parseObject(JSON.toJSONString(applyInfo.getContent()), PurchaseApplyApiModel.class);
            return purchaseApplyApiModel;
        } catch (Exception e) {
            LOGGER_ERROR.error("getPurchaseApplyInfoFromApi occurs error : ", e);
        }
        return null;
    }

}
