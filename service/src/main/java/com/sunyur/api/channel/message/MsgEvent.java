package com.sunyur.api.channel.message;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 10:37
 */
public enum MsgEvent {

    ORDER_CREATE("ORDER:SUBMIT"),
    ORDER_CANCEL_CONFIRM("ORDER:CANCEL_CONFIRM"),
    ORDER_CLOSE_ITEM_CONFIRM("ORDER:CLOSE_ITEM_CONFIRM"),
    RECEIVE_ORDER_CREATE("RECEIVE_ORDER:CREATE"),
    INVOICE_ORDER_CONFIRM("INVOICE_ORDER:CONFIRM"),

    /** 领用创建*/
    RECIPIENTS_CREATE("RECIPIENTS:CREATE"),

    /** 领用出库*/
    RECIPIENTS_WAREHOUSE_OUT("RECIPIENTS:WAREHOUSE_OUT"),

    /** 请购创建*/
    PURCHASE_APPLY_CREATE("PURCHASE_APPLY:CREATE"),

    /** 协议创建*/
    PROTOCOL_CREATE("PROTOCOL:CREATE");

    private final String code;

    private MsgEvent(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public static MsgEvent getByCode(String code) {
        switch (code) {
            case "ORDER:SUBMIT":
                return ORDER_CREATE;
            case "ORDER:CANCEL_CONFIRM":
                return ORDER_CANCEL_CONFIRM;
            case "ORDER:CLOSE_ITEM_CONFIRM":
                return ORDER_CLOSE_ITEM_CONFIRM;
            case "RECEIVE_ORDER:CREATE":
                return RECEIVE_ORDER_CREATE;
            case "INVOICE_ORDER:CONFIRM":
                return INVOICE_ORDER_CONFIRM;
            default:
                return null;
        }
    }
}
