package com.sunyur.api.channel.service.materiel;

import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.param.materiel.SunyurMaterielParam;

import java.util.List;

/**
 * @Description 物料信息同步给商越
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/27 11:33 AM
 */
public interface SunyurMaterielService {
    /**
     * @Description: 物料信息同步给商越
     * @author: chenyu.zheng
     * @date: 2019/8/27 11:38 AM
     * @param [materialParamList]
     * @return
     */
    ModelResult<Boolean> batchSaveMaterial(List<SunyurMaterielParam> materialParamList);

}
