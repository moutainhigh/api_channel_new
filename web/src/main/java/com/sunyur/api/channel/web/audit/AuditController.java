package com.sunyur.api.channel.web.audit;

import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.param.audit.PurchaseApplyAuditParam;
import com.sunyur.api.channel.param.purchase.PurchaseApplyOutsideAuditResultParam;
import com.sunyur.api.channel.param.purchase.PurchaseOutsideAuditParam;
import com.sunyur.api.channel.service.audit.OutsideAuditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description 审批同步接口
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/9/24 2:32 PM
 */
@Controller
@RequestMapping("/audit")
public class AuditController {
    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(AuditController.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(AuditController.class);

    @Autowired
    private OutsideAuditService outsideAuditService;
    /**
     * sync result of audit to sy
     *
     * @param param     PurchaseApplyAuditParam
     * @return          Boolean
     */
    @RequestMapping("/sync")
    @ResponseBody
    public ModelResult<Boolean> auditSync(@RequestBody PurchaseApplyAuditParam param) {
        LOGGER_INFO.info("auditSync parameter is : {}", JSON.toJSONString(param));
        ModelResult<Boolean> result = new ModelResult<Boolean>();
        if (null == param || CollectionUtils.isEmpty(param.getAuditRecordList())) {
            result.setErrorMessage("501","参数为空");
            return result;
        }
        try {
            //10 请购
            if (param.getSourceType()==10){
                PurchaseApplyOutsideAuditResultParam purchaseApplyOutsideAudit = new PurchaseApplyOutsideAuditResultParam();
                transferRequestParamToService(param, purchaseApplyOutsideAudit);
                outsideAuditService.doAudit(purchaseApplyOutsideAudit);
            }else {
                PurchaseOutsideAuditParam purchaseOutsideAuditParam = new PurchaseOutsideAuditParam();
                transferRequestParamToService(param, purchaseOutsideAuditParam);
                outsideAuditService.doAudit(purchaseOutsideAuditParam);
            }
            result.setContent(true);
        } catch (Exception e) {
            LOGGER_ERROR.error("audit status sync occurs error : ", e);
            return new ModelResult<>(false);
        }
        return result;
    }
    private void transferRequestParamToService(PurchaseApplyAuditParam source, PurchaseApplyOutsideAuditResultParam target) {
        target.setApplyCode(source.getSourceCode());
        target.setStatus(source.getStatus());
        target.setStatusDesc(source.getStatusDesc());

        PurchaseApplyOutsideAuditResultParam auditResult = new PurchaseApplyOutsideAuditResultParam();
        PurchaseApplyOutsideAuditResultParam.ApplyAuditRecord audit = auditResult.new ApplyAuditRecord();
        BeanUtils.copyProperties(source.getAuditRecordList().get(source.getAuditRecordList().size()-1), audit);
        List<PurchaseApplyOutsideAuditResultParam.ApplyAuditRecord> auditRecordList = new ArrayList<>();
        auditRecordList.add(audit);
        target.setAuditRecordList(auditRecordList);
    }

    private void transferRequestParamToService(PurchaseApplyAuditParam source, PurchaseOutsideAuditParam target) {
        target.setSourceCode(source.getSourceCode());
        target.setSourceType(source.getSourceType());
        target.setStatus(source.getStatus());
        target.setStatusDesc(source.getStatusDesc());
        PurchaseOutsideAuditParam.ApplyAuditRecord audit = new PurchaseOutsideAuditParam.ApplyAuditRecord();
        BeanUtils.copyProperties(source.getAuditRecordList().get(source.getAuditRecordList().size()-1), audit);
        List<PurchaseOutsideAuditParam.ApplyAuditRecord> auditRecordList  = new ArrayList<>();
        auditRecordList.add(audit);
        target.setAuditRecordList(auditRecordList);
    }
}
