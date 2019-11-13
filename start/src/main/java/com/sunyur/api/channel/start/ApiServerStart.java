/**
 * Copyright(c) 2018 sunyur.com, All Rights Reserved.
 * Project: start
 * Author: houzi
 * Createdate: 11:29:47 AM
 */
package com.sunyur.api.channel.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;


/**
 * @Description:服务启动入口
 * @author houzi
 * @date May 20, 2019 11:29:47 AM
 */
@SpringBootApplication
@EnableAsync
@ImportResource({ "classpath:xml_config/*.xml" })
@ComponentScan(value = "com.sunyur.api.channel")
public class ApiServerStart {

	public static void main(String[] args) {
        SpringApplication.run(ApiServerStart.class, args);
    }
}
