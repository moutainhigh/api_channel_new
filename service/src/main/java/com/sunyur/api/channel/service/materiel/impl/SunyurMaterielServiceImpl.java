package com.sunyur.api.channel.service.materiel.impl;

import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.base.ModelResultUtil;
import com.sunyur.api.channel.common.httpclient.ApiHttpClient;
import com.sunyur.api.channel.param.materiel.SunyurMaterielParam;
import com.sunyur.api.channel.service.materiel.SunyurMaterielService;
import com.sunyur.api.channel.service.user.impl.SunyurUserServiceImpl;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 同步物料
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/27 11:57 AM
 */
@Service("sunyurMaterialService")
public class SunyurMaterielServiceImpl implements SunyurMaterielService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(SunyurUserServiceImpl.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(SunyurUserServiceImpl.class);

    @Autowired
    private HttpClient httpClient;

    @Value("${remote.api.materiel.http}")
    private String materialHttp;
    @Value("${remote.api.base.http}")
    private String baseUrl;
    @Value("${app_key}")
    private String appkey;
    @Value("${app_secret}")
    private String appSecret;

    /**
     * 每批次数量
     */
    private final static int BATCH_INDEX = 300;

    /**
     * @Description: 调用商越同步物料接口
     * @author: chenyu.zheng
     * @date: 2019/8/27 11:59 AM
     * @param [materialParamList]
     * @return
     */
    @Override
    public ModelResult<Boolean> batchSaveMaterial(List<SunyurMaterielParam> materialParamList) {
        LOGGER_INFO.info("当天物料同步数量: {}",materialParamList.size());

        ModelResult<Boolean> result = new ModelResult<Boolean>();
        result.setContent(false);
        try {
            int listSize = materialParamList.size();

            int toIndex = BATCH_INDEX;

            //分批传给商越每次50条
            for(int i = 0;i<listSize;i+=BATCH_INDEX){
                if(i+BATCH_INDEX>listSize){
                    toIndex=listSize-i;
                }
                List newList = materialParamList.subList(i,i+toIndex);
                //同步给商越
                String reqJsonStr = JSON.toJSONString(newList);
                ModelResult<Boolean> sunyurResult = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, baseUrl, materialHttp, reqJsonStr);
                if (!ModelResultUtil.isSuccess(sunyurResult) || !sunyurResult.getContent()){
                    LOGGER_ERROR.error("同步给商越物料错误, materielList is {} " , JSON.toJSONString(newList));
                }
            }
           result.setContent(true);
        } catch (Exception e) {
            LOGGER_ERROR.error("batchSaveMaterial is Exception ", e);
        }
        return result;
    }
}
