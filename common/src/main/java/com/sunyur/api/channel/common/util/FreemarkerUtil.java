package com.sunyur.api.channel.common.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Copyright(c) 2019 Sunyur.com, All Rights Reserved.<p>
 *
 * <p>description  :  freemarker util</p>
 * <p>className    :  FreemarkerUtil </p>
 * <p>create time  :  2019-09-03 14:11</p>
 * <p>@version     :  1.0</p>
 *
 * @author <p>     :  Gauler</p>
 **/
public class FreemarkerUtil {

    public static void frameMakerFTL(Object obj) throws IOException, TemplateException, IllegalAccessException {
        //read configuration of frameMaker
        Configuration cfg = new Configuration();
        //路径可以是绝对路径，也可以是相对路径
        cfg.setDirectoryForTemplateLoading(new File("/xxx/xxx/"));
        //2,read ftl template
        Template t1 = cfg.getTemplate("temp.ftl");//在配置文件下面的路径,此文件的扩展名可以任意。

        Map<String, Object>  map = objToHash(obj);

        //写到控制台
        PrintWriter write = new PrintWriter(System.out);
//        Writer write = new OutputStreamWriter(System.out);
        t1.process(map, write);
        write.flush();
        write.close();


    }

//    public static void main(String[] args) throws IOException, TemplateException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        TestFrameMaker t = new TestFrameMaker();
//        t.setDescription("wtf description");
//        t.setHello("wtf Hello World");
//        frameMakerFTL(t);
//    }
//
//    static class TestFrameMaker{
//        private String hello;
//
//        private String description;
//
//        public String getHello() {
//            return hello;
//        }
//
//        public void setHello(String hello) {
//            this.hello = hello;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//    }

    private static HashMap<String, Object> objToHash(Object obj) throws IllegalArgumentException,IllegalAccessException {

        HashMap<String, Object> hashMap = new HashMap<>();
        Class clazz = obj.getClass();
        List<Class> clazzs = new ArrayList<>();

        do {
            clazzs.add(clazz);
            clazz = clazz.getSuperclass();
        } while (!clazz.equals(Object.class));

        for (Class iClazz : clazzs) {
            Field[] fields = iClazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                Object objVal = field.get(obj);
                hashMap.put(field.getName(), objVal);
            }
        }

        return hashMap;
    }

}
