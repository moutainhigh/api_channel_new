package com.sunyur.api.channel.config;

import com.sunyur.api.channel.message.MsgPutHandlerRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sunyur.api.channel.message.MsgEvent;

/**
 * @author dongjianqiao
 * @version 0.2
 * @Description:
 * @date 2019/9/3 10:35
 */
@Configuration
public class MsgConfig {

    @Bean
    MsgPutHandlerRegistry msgPutHandlerRegistry(){
        MsgPutHandlerRegistry registry = new MsgPutHandlerRegistry();
//        registry.add(MsgEvent.ORDER_CREATE.getCode(),orderCreateHandler());

        return registry;
    }

//    @Bean
//    OrderCreateHandler orderCreateHandler(){
//        return new OrderCreateHandler();
//    }

}
