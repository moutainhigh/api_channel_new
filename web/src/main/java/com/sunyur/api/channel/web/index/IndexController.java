package com.sunyur.api.channel.web.index;

import com.sunyur.api.channel.common.base.ModelResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/21 1:07 PM
 */
@Controller
@RequestMapping("/ok")
public class IndexController {

    @RequestMapping(value = "", method = RequestMethod.HEAD)
    @ResponseBody
    public ModelResult index() throws  Exception{

        ModelResult result = new ModelResult();
        result.setContent("测试页面OK!");

        return result;
    }
}
