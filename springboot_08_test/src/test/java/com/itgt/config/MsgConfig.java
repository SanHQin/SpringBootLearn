package com.itgt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MsgConfig {
    @Bean
    public String msg(){
        return "覃罡彤";
    }
}
