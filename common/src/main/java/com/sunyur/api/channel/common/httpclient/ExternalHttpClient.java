package com.sunyur.api.channel.common.httpclient;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.*;


/**
 * @Description 外部 httpClient 工具
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/22 4:39 PM
 */
public class ExternalHttpClient {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(ApiHttpClient.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(ApiHttpClient.class);

    private static class InnerClass {
        private static ExternalHttpClient INSTANCE = new ExternalHttpClient();
    }

    public static ExternalHttpClient getInstance() {

        return ExternalHttpClient.InnerClass.INSTANCE;
    }

    /**
     * @return
     * @Description: oppo
     * @author: chenyu.zheng
     * @param [httpClient, url, paramMap]
     * @date: 2019/8/22 4:59 PM
     */
    public static String execGet(HttpClient httpClient, String baseUrl, String path, Object reqObj) throws Exception {
        LOGGER_INFO.info("ExternalHttpClient execGet path [{}],requestBody [{}]", baseUrl+path, JSON.toJSONString(reqObj));

        List<NameValuePair> formparams = setHttpParams(reqObj);
        String param = URLEncodedUtils.format(formparams, "UTF-8");

        URIBuilder uriBuilder = new URIBuilder(baseUrl + path);

        uriBuilder.setParameters(formparams);
        HttpGet http = new HttpGet(uriBuilder.build());
        http.addHeader("Content-Type", "application/x-www-form-urlencoded");

        HttpResponse httpResponse = httpClient.execute(http);
        String responseBody = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            LOGGER_INFO.info("ExternalHttpClient execGet success result is {}", responseBody);
        } else {
            LOGGER_ERROR.error("ExternalHttpClient execGet error requestBody {}", JSON.toJSONString(reqObj));
            LOGGER_ERROR.error("ExternalHttpClient execGet error result is {}", responseBody);
        }
        return responseBody;
    }

    /**
     * @Description: oppo post 请求
     * @author: chenyu.zheng
     * @date: 2019/8/22 5:39 PM
     * @param [httpClient, url, requestBody]
     * @return
     */
    public static String execPost(HttpClient httpClient,String baseUrl, String path, Object requestBody) throws Exception {
        LOGGER_INFO.info("ExternalHttpClient execPost path [{}],requestBody [{}]", baseUrl+path, JSON.toJSONString(requestBody));
        HttpPost httpPost = new HttpPost(baseUrl+path);

        List<NameValuePair> formparams = setHttpParams(requestBody);
        // 使用URL实体转换工具
        UrlEncodedFormEntity entityParam = new UrlEncodedFormEntity(formparams, "UTF-8");
        httpPost.setEntity(entityParam);

        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");

        HttpResponse httpResponse = httpClient.execute(httpPost);
        String responseBody = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");

        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            LOGGER_INFO.info("ExternalHttpClient execPost success result is {}",responseBody);
        } else {
            LOGGER_ERROR.error("ExternalHttpClient execPost is error responseBody {}", responseBody);
        }
        return responseBody;
    }
    /**
     * @Description: 发送邮件 post请求
     * @author: chenyu.zheng
     * @date: 2019/8/27 9:47 AM
     * @param [httpClient, baseUrl, path, requestBody]
     * @return
     */
    public static String execPostForEmail(HttpClient httpClient, String baseUrl, String path, Object requestBody) throws Exception {
        LOGGER_INFO.info("ExternalHttpClient execPostForEmail path [{}],requestBody [{}]", baseUrl+path, JSON.toJSONString(requestBody));
        HttpPost httpPost = new HttpPost(baseUrl+path);
        httpPost.setHeader("Content-Type","multipart/form-data");
        MultipartEntityBuilder multipartEntityBuilder = setFormDataParam(requestBody);
        multipartEntityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        multipartEntityBuilder.setCharset(Charset.forName("UTF-8"));
        httpPost.setEntity(multipartEntityBuilder.build());

        HttpResponse httpResponse = httpClient.execute(httpPost);
        String responseBody = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            LOGGER_INFO.info("ExternalHttpClient execPostForEmail success result is {}",responseBody);
        } else {
            LOGGER_ERROR.error("ExternalHttpClient execPostForEmail is error requestBody {}", JSON.toJSONString(requestBody));
            LOGGER_ERROR.error("ExternalHttpClient execPostForEmail is error {}", responseBody);
        }
        return responseBody;
    }
    /**
     * @Description: 解析model 设置http请求参数
     * @author: chenyu.zheng
     * @date: 2019/8/22 5:36 PM
     * @param [obj]
     * @return
     */
    public static List<NameValuePair> setHttpParams(Object obj) {
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        Map map = new HashMap();
        Class c;
        Set<String> set = new TreeSet<String>();
        try {
            c = Class.forName(obj.getClass().getName());
            Method[] m = c.getMethods();
            for (int i = 0; i < m.length; i++) {
                String method = m[i].getName();
                if (method.startsWith("get") && !"getSignature".equals(method) && !"getClass".equals(method)) {
                    try {
                        Object value = m[i].invoke(obj);
                        if (value != null) {
                            String key = method.substring(3);
                            key = key.substring(0, 1).toLowerCase() + key.substring(1);
                            map.put(key, value);
                            set.add(key);
                        }
                    } catch (Exception e) {
                        LOGGER_INFO.error("setHttpParams  is Exception" + e);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str : set) {
            formparams.add(new BasicNameValuePair(str, map.get(str).toString()));
        }
        return formparams;
    }
    /**
     * @Description: 设置 multipart/form-data 传输需要参数
     * @author: chenyu.zheng
     * @date: 2019/8/30 9:08 AM
     * @param [obj]
     * @return
     */
    public static MultipartEntityBuilder setFormDataParam(Object obj){
        //创建 MultipartEntityBuilder,以此来构建我们的参数
        MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
        Map map = new HashMap();
        Class c;
        Set<String> set = new TreeSet<String>();
        try {
            c = Class.forName(obj.getClass().getName());
            Method[] m = c.getMethods();
            for (int i = 0; i < m.length; i++) {
                String method = m[i].getName();
                if (method.startsWith("get") && !"getSignature".equals(method) && !"getClass".equals(method)) {
                    try {
                        Object value = m[i].invoke(obj);
                        if (value != null) {
                            String key = method.substring(3);
                            key = key.substring(0, 1).toLowerCase() + key.substring(1);
                            map.put(key, value);
                            set.add(key);
                        }
                    } catch (Exception e) {
                        LOGGER_INFO.error("setFormDataParam  is Exception" + e);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String str : set) {
            ContentType contentType = ContentType.create("text/plain",Charset.forName("UTF-8"));
            entityBuilder.addTextBody(str, map.get(str).toString(),contentType);

        }
        return entityBuilder;
    }

    public static String execGet(HttpClient httpClient, String baseUrl, String path, Object reqObj,
                                 String AuthToken,String thirdAppId,String appId) throws Exception {
        LOGGER_INFO.info("ExternalHttpClient execGet path [{}],requestBody [{}]", baseUrl+path, JSON.toJSONString(reqObj));

        URIBuilder uriBuilder = new URIBuilder(baseUrl + path);
        if (null != reqObj){
            List<NameValuePair> formparams = setHttpParams(reqObj);
            uriBuilder.setParameters(formparams);
        }

        HttpGet http = new HttpGet(uriBuilder.build());
        //http.addHeader("Content-Type", "application/x-www-form-urlencoded");
        http.addHeader("Content-Type", "application/json;charset=UTF-8");
        http.addHeader("AuthToken", AuthToken);
        http.addHeader("thirdAppId", thirdAppId);
        http.addHeader("appId", appId);

        HttpResponse httpResponse = httpClient.execute(http);
        String responseBody = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            LOGGER_INFO.info("ExternalHttpClient execGet success result is {}", responseBody);
        } else {
            LOGGER_ERROR.error("ExternalHttpClient execGet error requestBody {}", JSON.toJSONString(reqObj));
            LOGGER_ERROR.error("ExternalHttpClient execGet error result is {}", responseBody);
        }
        return responseBody;
    }
}
