package com.sunyur.api.channel.test.user;

import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.param.materiel.SunyurMaterielParam;
import com.sunyur.api.channel.service.materiel.SunyurMaterielService;
import com.sunyur.api.channel.start.ApiServerStart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/21 8:13 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiServerStart.class)
public class TsetUser {

    @Autowired
    private SunyurMaterielService sunyurMaterielService;
    @Test
    public void test(){
        List<SunyurMaterielParam> materielList = new ArrayList<>();
        SunyurMaterielParam sunyurMaterielParam = new SunyurMaterielParam();
        sunyurMaterielParam.setUnitCode("PCS");
        sunyurMaterielParam.setStatus(1);
        sunyurMaterielParam.setRemark("印刷品 招聘海报");
        sunyurMaterielParam.setName("印刷品 招聘海报");
        sunyurMaterielParam.setCategoryCode("02.消耗");
        sunyurMaterielParam.setCode("535614918");
        materielList.add(sunyurMaterielParam);
        ModelResult<Boolean> sunyurResult = sunyurMaterielService.batchSaveMaterial(materielList);

    }
}
