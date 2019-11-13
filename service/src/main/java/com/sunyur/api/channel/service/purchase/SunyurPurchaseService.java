package com.sunyur.api.channel.service.purchase;

import com.sunyur.api.channel.model.purchase.PurchaseApplyApiModel;


/**
 * <p>Copyright(c) 2019 Sunyur.com, All Rights Reserved.<p>
 *
 * <p>description  :  service operate of oppo</p>
 * <p>className    :  OppoPurchaseService </p>
 * <p>create time  :  2019-08-28 11:41</p>
 * <p>@version     :  1.0</p>
 *
 * @author <p>     :  Gauler</p>
 **/
public interface SunyurPurchaseService {
    /**
     * get purchase apply info from api_gate_way by purchase_apply_code
     *
     * @param purchaseApplyCode     purchaseApplyCode
     * @return                      PurchaseApplyApiModel
     */
    PurchaseApplyApiModel getPurchaseApplyInfoFromApi(String purchaseApplyCode);

}
