package com.sunyur.api.channel.service.organization;

import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.param.organization.OrganizationParam;

import java.util.List;

/**
 * @Description 调用商越api接口的service
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/21 7:49 PM
 */
public interface SunyurOrganizationService {

    /**
     * @Description: 向商越同步组织
     * @author: chenyu.zheng
     * @date: 2019/8/22 9:37 AM
     * @param [organizationParam]
     * @return
     */
    ModelResult<Boolean> batchSaveOrganization(List<OrganizationParam> listOrganizationParam);
    /**
     * @Description: 查询公司级组织的codes
     * @author: chenyu.zheng
     * @date: 2019/11/11 3:53 PM
     * @param
     * @return
     */
    ModelResult<List<String>>  listCompanyOrganization();

}
