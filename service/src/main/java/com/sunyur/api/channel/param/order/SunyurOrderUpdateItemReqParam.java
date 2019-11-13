package com.sunyur.api.channel.param.order;

import java.util.Map;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 21:20
 */
public class SunyurOrderUpdateItemReqParam {

    // 订单行ID
    private String code;
    // 资产代码
    private Map<String,Object> assetCode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Object> getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(Map<String, Object> assetCode) {
        this.assetCode = assetCode;
    }
}
