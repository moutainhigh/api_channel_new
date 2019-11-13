package com.sunyur.api.channel.service.protocol.impl;
import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.base.ModelResultUtil;
import com.sunyur.api.channel.common.httpclient.ApiHttpClient;
import com.sunyur.api.channel.model.protocol.ProtocolApiModel;
import com.sunyur.api.channel.service.protocol.SunyurProtocolService;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description: 协议
 * @Author xujianhong
 * @Date 2019/09/23 17:09
 * @Version 1.0
 */
@Service("sunyurProtocolService")
public class SunyurProtocolServiceImpl implements SunyurProtocolService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(SunyurProtocolServiceImpl.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(SunyurProtocolServiceImpl.class);

    @Value("${remote.api.base.http}")
    private String sunyurBaseUrl;

    @Value("${remote.api.protocol.get.http}")
    private String protocolGetPath;

    @Value("${app_key}")
    private String appkey;
    @Value("${app_secret}")
    private String appSecret;

    @Autowired
    private HttpClient httpClient;

    /**
     * @param protocolSerialNumber
     * @return ProtocolApiModel
     * @Description 获取协议数据
     * @Author xujianhong
     * @Date 2019/8/20 15:07
     **/
    @Override
    public ProtocolApiModel getProtocolInfoFromApi(String protocolSerialNumber) {
        LOGGER_INFO.info("getProtocolInfoFromApi, input protocolSerialNumber : {}", protocolSerialNumber);
        try {
            //TODO 调用API获取数据接口
            String newUrl = protocolGetPath + "?serialNumber=" +protocolSerialNumber;
            ModelResult<ProtocolApiModel>   protocolInfo = ApiHttpClient.getInstance(appkey, appSecret).execGet(httpClient, sunyurBaseUrl, newUrl, protocolSerialNumber);
            LOGGER_INFO.info("call api for getting protocol info : {}", JSON.toJSONString(protocolInfo));

            if (!ModelResultUtil.isSuccess(protocolInfo)) {
                return null;
            }
            ProtocolApiModel protocolApiModel = JSON.parseObject(JSON.toJSONString(protocolInfo.getContent()), ProtocolApiModel.class);
            return protocolApiModel;
        } catch (Exception e) {
            LOGGER_ERROR.error("getProtocolInfoFromApi occurs error : ", e);
        }
        return null;
    }
}
