package com.sunyur.api.channel.service.purchase;


import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.model.purchase.RecipientsSubmitMoInfoModel;
import com.sunyur.api.channel.model.purchase.RecipientsWarehouseOutModel;

/**
 * @Description:OppoRecipientsService
 * @project service
 * @class OppoRecipientsService.java
 * @author lishaochun
 * @version 1.0
 * @date 2019年9月27日 上午11:19:41
 */
public interface SunyurRecipientsService {


    /**
     * @Description:获取领用提交信息
     * @author lishaochun
     * @date 2019年9月27日 上午11:19:04
     * @param code
     * @return
     */
    ModelResult<RecipientsSubmitMoInfoModel> getSubmitInfoByApi(long id);

    /**
     * @Description:获取出库信息
     * @author lishaochun
     * @date 2019年9月29日 下午5:35:19
     * @param id
     * @return
     */
    ModelResult<RecipientsWarehouseOutModel> getWarehouseOutInfoByApi(long id);

}
