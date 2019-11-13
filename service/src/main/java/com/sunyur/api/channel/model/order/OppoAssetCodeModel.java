package com.sunyur.api.channel.model.order;

import java.io.Serializable;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:获取资产代码结果
 * @date 2019/8/29 9:43
 */
public class OppoAssetCodeModel implements Serializable{

    private static final long serialVersionUID = 2277485688218344933L;

    // 系统标识
    private String source_system;
    // 来源订单号
    private String source_order;
    // 来源订单行号
    private String source_line_num;
    // 资产代码 - 自
    private String asset_code_f;
    // 资产代码 - 至
    private String asset_code_t;
    // 来源订单ID
    private String source_header_id;
    // 来源订单行ID
    private String source_line_id;

    public String getSource_system() {
        return source_system;
    }

    public void setSource_system(String source_system) {
        this.source_system = source_system;
    }

    public String getSource_order() {
        return source_order;
    }

    public void setSource_order(String source_order) {
        this.source_order = source_order;
    }

    public String getSource_line_num() {
        return source_line_num;
    }

    public void setSource_line_num(String source_line_num) {
        this.source_line_num = source_line_num;
    }

    public String getAsset_code_f() {
        return asset_code_f;
    }

    public void setAsset_code_f(String asset_code_f) {
        this.asset_code_f = asset_code_f;
    }

    public String getAsset_code_t() {
        return asset_code_t;
    }

    public void setAsset_code_t(String asset_code_t) {
        this.asset_code_t = asset_code_t;
    }

    public String getSource_header_id() {
        return source_header_id;
    }

    public void setSource_header_id(String source_header_id) {
        this.source_header_id = source_header_id;
    }

    public String getSource_line_id() {
        return source_line_id;
    }

    public void setSource_line_id(String source_line_id) {
        this.source_line_id = source_line_id;
    }
}
