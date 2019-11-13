/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Author: jiaming.liu
 * Createdate: 2019/1/25
 */
package com.sunyur.api.channel.web.auth;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sunyur.api.channel.common.util.SYAPIUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiaming.liu
 * @version ${VERSION}
 * @Description:
 * @date 2019/1/25
 */
public class RequestResponseHandlerInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestResponseHandlerInterceptor.class);
    @Value("${app_key}")
    private String appkey;

    @Value("${app_secret}")
    private String app_secret;

    @Value("${apichannel.auth}")
    private String apichannelAuth;
    /**
     * 有效时间30分钟
     */
    private static Long TIME =  60*30L;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	LOGGER.info("preHandle path is {}", request.getServletPath());

        String timestamp = request.getHeader("X-Ca-Timestamp");
        String signature = request.getHeader("X-Ca-Signature");
        String contentType = request.getHeader("Content-Type");
        String secret = request.getHeader("X-Ca-Key");
        String appId = request.getHeader("X-Ca-AppId");
        String method = request.getMethod();

        LOGGER.info("preHandle timestamp {} signature {} contentType {}",timestamp, signature,contentType);

        LOGGER.info("preHandle appId {} secret {} ",appId,secret);

        if (apichannelAuth.equals("false")){
            return true;
        }
        // 验证时间戳
        Calendar c = Calendar.getInstance();
        long nowTimestamp = c.getTimeInMillis()/1000;
        long reqTimestamp = Long.valueOf(timestamp);
        if ( nowTimestamp-reqTimestamp > TIME){
            setResponse(response,"401","请求已失效");
            return false;
        }

        //校验appId
        if (!appkey.equals(appId) ||  !app_secret.equals(secret)){
            setResponse(response,"402","访问未授权");
    	    return false;
        }

        Map<String, String> headers = new HashMap<>();
        headers.put("X-Ca-Timestamp",timestamp);
        headers.put("Content-Type",contentType);
        headers.put("X-Ca-Key",appkey);
        String sign = SYAPIUtils.sign(appkey, method, request.getServletPath(), headers, null);

        if ( signature==null ||  !sign.equals(signature)){
            setResponse(response,"403","签名错误");
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
    /**
     * response 返回参数
     */
    private void setResponse(HttpServletResponse response,String code,String msg){
        PrintWriter out = null ;
        try{
            response.setContentType("application/json; charset=utf-8");
            JSONObject res = new JSONObject();
            res.put("code",code);
            res.put("msg",msg);
            out = response.getWriter();
            out.write(res.toString());
            out.flush();
            LOGGER.info("RequestResponseHandlerInterceptor auth is error result {}", JSON.toJSONString(res) );
        }catch (Exception e){
            LOGGER.error("RequestResponseHandlerInterceptor setResponse is Exception",e);
        }finally {
            out.close();
        }
    }
}
