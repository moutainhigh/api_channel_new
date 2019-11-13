package com.sunyur.api.channel.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @Description 签名工具
 * @Author: chenyu.zheng
 * @Version: 1.0
 * @date: 2019/8/21 5:42 PM
 */
public class SignatureUtil {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(SignatureUtil.class);

    /**
     * @Description: 根据model排序返回签名
     * @author: chenyu.zheng
     * @date: 2019/8/21 5:57 PM
     * @param [obj]
     * @return
     */
    public static String sortParamByModel(Object obj) {
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
                        LOGGER_INFO.error("sortParamByModel  is Exception" + e);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuffer result = new StringBuffer("");
        for (String str : set) {
            result.append("\n").append(str).append("=").append(map.get(str));
        }

        LOGGER_INFO.info("参数排序："+ result.substring(1));
        return result.substring(1);
    }

    /**
     * @Description: 根据Map生成升序排序的字符串
     * @author: chenyu.zheng
     * @date: 2019/8/21 5:43 PM
     * @param [paramMap]
     * @return
     */
    public static String sortParamByMap(Map paramMap) {
        Map treeMap = new TreeMap(paramMap);
        StringBuffer result = new StringBuffer("");

        Set<Map.Entry<Object, Object>> set = treeMap.entrySet();
        Iterator<Map.Entry<Object, Object>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Object, Object> map = it.next();
            String key = map.getKey() + "";
            String value = map.getValue() + "";
            if(!"signature".equalsIgnoreCase(key) && value != null ){
                result.append("\n").append(key).append("=").append(value);
            }
        }
        LOGGER_INFO.info("参数排序："+ result.substring(1));
        return result.substring(1);
    }
    /**
     * @Description: oppo 签名
     * @author: chenyu.zheng
     * @date: 2019/8/21 7:14 PM
     * @param [apiPath, secret,obj]
     * @return
     */
    public static String getSign(String apiPath,String secret,Object obj ){

        //参数排序
        String paramNameValuePairs = SignatureUtil.sortParamByModel(obj);
        LOGGER_INFO.info("SignatureUtil.getSign param is {}", String.valueOf(paramNameValuePairs));
        //拼接sign
        StringBuffer signBuffer = new StringBuffer();
        signBuffer.append(apiPath).append("\n")
                .append(String.valueOf(paramNameValuePairs)).append("\n")
                .append(secret);
        LOGGER_INFO.info("SignatureUtil.getSign sign param is {}", signBuffer.toString());
        //签名
        String sign = MD5Utils.encrypt32(String.valueOf(signBuffer));
        LOGGER_INFO.info("SignatureUtil.getSign sign is {}", sign);

        return sign;
    }

    public static void main(String[] args) throws Exception {

    }

}
