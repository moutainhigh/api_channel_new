package com.sunyur.api.channel.service.audit.impl;

import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.httpclient.ApiHttpClient;
import com.sunyur.api.channel.param.purchase.PurchaseApplyOutsideAuditResultParam;
import com.sunyur.api.channel.param.purchase.PurchaseOutsideAuditParam;
import com.sunyur.api.channel.service.audit.OutsideAuditService;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description 外部审核
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/11/13 2:41 PM
 */
@Service("outsideAuditService")
public class OutsideAuditServiceImpl implements OutsideAuditService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(OutsideAuditServiceImpl.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(OutsideAuditServiceImpl.class);

    @Value("${app_key}")
    private String appkey;

    @Value("${app_secret}")
    private String appSecret;

    @Value("${remote.api.base.http}")
    private String sunyurBaseUrl;

    @Value("${remote.api.purchase.audit.http}")
    private String purchaseAuditPath;

    @Value("${remote.api.outside.audit.http}")
    private String outsideAuditPath;

    @Autowired
    private HttpClient httpClient;

    /**
     * {@inheritDoc}
     *
     * @param purchaseApplyOutsideAudit purchaseApplyOutsideAudit
     * @return
     * @throws Exception
     */
    @Override
    @SuppressWarnings("unchecked")
    public ModelResult<Boolean> doAudit(PurchaseApplyOutsideAuditResultParam purchaseApplyOutsideAudit) throws Exception {
        LOGGER_INFO.info("doAudit, input purchaseApplyOutsideAudit : {}", JSON.toJSONString(purchaseApplyOutsideAudit));
        ModelResult<Boolean> result = new ModelResult<Boolean>();
        result.setContent(false);
        try {
            ModelResult<Boolean> modelResult;
            modelResult = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, sunyurBaseUrl, purchaseAuditPath, JSON.toJSONString(purchaseApplyOutsideAudit));
            LOGGER_INFO.info("call remote for sync purchase apply audit result : {}", JSON.toJSONString(modelResult));
            return modelResult;
        } catch (Exception e) {
            LOGGER_ERROR.error("doAudit is error : ", e);
        }
        return result;
    }
    /**
     * @Description: 外部审批 领用和协议
     * @author: chenyu.zheng
     * @date: 2019/10/12 9:48 AM
     * @param param
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public ModelResult<Boolean> doAudit(PurchaseOutsideAuditParam param) throws Exception {
        LOGGER_INFO.info("doAudit, input OutsideAudit : {}", JSON.toJSONString(param));
        ModelResult<Boolean> result = new ModelResult<Boolean>();
        result.setContent(false);
        try {
            ModelResult<Boolean> modelResult;
            modelResult = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, sunyurBaseUrl, outsideAuditPath, JSON.toJSONString(param));
            LOGGER_INFO.info("call remote for sync audit result : {}", JSON.toJSONString(modelResult));
            return modelResult;
        } catch (Exception e) {
            LOGGER_ERROR.error("doAudit is error : ", e);
        }
        return result;
    }
}
