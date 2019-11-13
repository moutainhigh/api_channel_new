package com.sunyur.api.channel.model.order;

import java.util.List;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 17:35
 */
public class OrderDetailModel {

    // 订单号
    private String code;
    // 结算主体编码
    private String settlementCompanyCode;
    // 采购员编码
    private String agentCode;
    // 申请人
    private String applyUserCode;
    // 供应商编号
    private String supplierCode;
    // 备注
    private String remark;
    // 送货地点
    private String receiveAddress;
    // 采购申请单得外部单号
    private String outCode;

    List<OrderDetailItemModel> items;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSettlementCompanyCode() {
        return settlementCompanyCode;
    }

    public void setSettlementCompanyCode(String settlementCompanyCode) {
        this.settlementCompanyCode = settlementCompanyCode;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getApplyUserCode() {
        return applyUserCode;
    }

    public void setApplyUserCode(String applyUserCode) {
        this.applyUserCode = applyUserCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getOutCode() {
        return outCode;
    }

    public void setOutCode(String outCode) {
        this.outCode = outCode;
    }

    public List<OrderDetailItemModel> getItems() {
        return items;
    }

    public void setItems(List<OrderDetailItemModel> items) {
        this.items = items;
    }
}
