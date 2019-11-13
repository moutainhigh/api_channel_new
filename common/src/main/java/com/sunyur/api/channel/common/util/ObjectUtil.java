/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Author: jiaming.liu
 * Createdate: 2018/12/19
 */
package com.sunyur.api.channel.common.util;

import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiaming.liu
 * @version 0.0.1
 * @Description:
 * @date 2018/12/19
 */
public class ObjectUtil {

    public static final <T> byte[] serialize(T obj){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream os = null;
        try {
            bos = new ByteArrayOutputStream();
            os = new ObjectOutputStream(bos);
            os.writeObject(obj);
            os.flush();
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(os != null){
                    os.close();
                }
                if(bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static final <T> T deserialize(byte[] bytes){
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);
            return (T) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static final Map<String, Object> toMap(Object obj){
        if(obj == null){
            return null;
        }
        if(obj instanceof Map){
            Map<String, Object> map = new HashMap<>();
            map.putAll((Map) obj);
            return map;
        }
        Map<String, Object> map = new HashMap<>();
        BeanMap beanMap = new BeanMap(obj);
        for(Map.Entry<Object, Object> beanMapEntry : beanMap.entrySet()){
            String beanMapKey = (String) beanMapEntry.getKey();
            if(StringUtils.equals(beanMapKey, "class")){
                continue;
            }
            map.put(beanMapKey, beanMapEntry.getValue());
        }
        return map;
    }

    /**
     * @Description: 添加isNull方法
     * @author Xiaolin.Wang
     * @version 1.0
     * @date  2019/4/8 21:27
     * @param
     * @return
     */
    public static boolean isNull(Object obj) {
        return null == obj ? true : false;
    }

    /**
     * @Description: 添加统一isNotNull
     * @author Xiaolin.Wang
     * @version 1.0
     * @date  2019/4/8 21:28
     * @param
     * @return
     */
    public static boolean isNotNull(Object obj) {
        return null != obj ? true : false;
    }

    /**
     * @Description: 字符串是空
     * @author Xiaolin.Wang
     * @version 1.0
     * @date  2019/4/8 21:33
     * @param
     * @return
     */
    public static boolean isStringNullOREmpty(String value) {
        if (value == null || "".equals(value.trim())) {
            return true;
        }
        return false;
    }

}
