package com.sunyur.api.channel.service.organization.impl;

import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.base.ModelResultUtil;
import com.sunyur.api.channel.common.httpclient.ApiHttpClient;
import com.sunyur.api.channel.model.organization.OrganizationModel;
import com.sunyur.api.channel.param.organization.OrganizationParam;
import com.sunyur.api.channel.service.organization.SunyurOrganizationService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 商越组织
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/23 9:38 AM
 */
@Service("sunyurOrganizationService")
public class SunyurOrganizationServiceImpl implements SunyurOrganizationService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(SunyurOrganizationServiceImpl.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(SunyurOrganizationServiceImpl.class);

    @Autowired
    private HttpClient httpClient;

    @Value("${remote.api.organization.http}")
    private String organizationHttp;
    @Value("${remote.api.organization.list.http}")
    private String organizationListHttp;
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
     * @Description: 调用商越组织同步接口
     * @author: chenyu.zheng
     * @date: 2019/8/23 9:39 AM
     * @param [organizationParam]
     * @return
     */
    @Override
    public ModelResult<Boolean> batchSaveOrganization(List<OrganizationParam> listOrganizationParam) {
        LOGGER_INFO.info("同步给商越的组织数量为: {}",listOrganizationParam.size());
        ModelResult<Boolean> result = new ModelResult<>();
        result.setContent(false);
        try{
            int listSize = listOrganizationParam.size();
            int toIndex = BATCH_INDEX;

            //分批传给商越每次100条
            for(int i = 0;i<listSize;i+=BATCH_INDEX){
                if(i+BATCH_INDEX>listSize){
                    toIndex=listSize-i;
                }
                List newList = listOrganizationParam.subList(i,i+toIndex);
                //同步给商越
                ModelResult<Boolean>  sunyurResult = ApiHttpClient.getInstance(appkey, appSecret).execPost(httpClient, baseUrl, organizationHttp, JSON.toJSONString(listOrganizationParam));

                if (!ModelResultUtil.isSuccess(sunyurResult) || !sunyurResult.getContent()){
                    LOGGER_ERROR.error("同步给商越错误的组织, userList is {} " , JSON.toJSONString(newList));
                }
            }
            result.setContent(true);
        }catch (Exception e){
            LOGGER_ERROR.error("batchSaveOrganization is Exception",e);
        }
        return result;
    }
    /**
     * @Description: 查询公司级组织的codes
     * @author: chenyu.zheng
     * @date: 2019/11/11 3:54 PM
     * @param
     * @return
     */
    @Override
    public ModelResult<List<String>> listCompanyOrganization() {
        LOGGER_INFO.info("listAllOrganization");
        ModelResult<List<String>> result = new ModelResult<List<String>>();
        try{
            ModelResult listModelResult = ApiHttpClient.getInstance(appkey, appSecret).execGet(httpClient, baseUrl, organizationListHttp, "");
            if (listModelResult == null || listModelResult.getContent()==null){
                return result;
            }
            List<OrganizationModel> organizationModelList = JSON.parseArray(listModelResult.getContent().toString(), OrganizationModel.class);
            List<String> companyOrgCodeList = new ArrayList<>();
            if (CollectionUtils.isNotEmpty(organizationModelList)){
                organizationModelList.forEach(item->{
                    if (item.getType() == 1 && StringUtils.isNotBlank(item.getCustomCode())){
                        companyOrgCodeList.add(item.getCustomCode());
                    }
                });
            }
            result.setContent(companyOrgCodeList);
            LOGGER_INFO.info("listCompanyOrganization result is {}",JSON.toJSONString(companyOrgCodeList));
        }catch (Exception e){
            LOGGER_ERROR.error("listCompanyOrganization is Exception",e);
        }
        return result;
    }
}
