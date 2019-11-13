package com.sunyur.api.channel.service.user;

import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.param.user.SunyurPurchaserUserParam;

import java.util.List;

/**
 * @Description 调用商越api接口的service
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/21 7:49 PM
 */
public interface SunyurUserService {

    /**
     * @Description: 同步全量用户数据
     * @author: chenyu.zheng
     * @date: 2019/8/23 1:04 PM
     * @param [listUserParam]
     * @return
     */
    ModelResult<Boolean> batchSaveUser(List<SunyurPurchaserUserParam> listUserParam);

}
