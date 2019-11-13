package com.sunyur.api.channel.service.audit;

import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.param.purchase.PurchaseApplyOutsideAuditResultParam;
import com.sunyur.api.channel.param.purchase.PurchaseOutsideAuditParam;

/**
 * @Description 外部审核
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/11/13 2:40 PM
 */
public interface OutsideAuditService {
    /**
     * @Description: 请购外部审核
     * @author: chenyu.zheng
     * @date: 2019/11/13 2:40 PM
     * @param [purchaseApplyOutsideAudit]
     * @return
     */
    ModelResult<Boolean> doAudit(PurchaseApplyOutsideAuditResultParam purchaseApplyOutsideAudit) throws Exception;
    /**
     * @Description: 领用 协议外部审核
     * @author: chenyu.zheng
     * @date: 2019/11/13 2:41 PM
     * @param [param]
     * @return
     */
    ModelResult<Boolean> doAudit(PurchaseOutsideAuditParam param) throws Exception;

}
