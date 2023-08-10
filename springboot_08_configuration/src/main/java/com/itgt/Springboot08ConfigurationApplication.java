package com.itgt;

import com.itgt.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot08ConfigurationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Springboot08ConfigurationApplication.class,args);
        ServerConfig sc = ctx.getBean(ServerConfig.class);
        System.out.println(sc);
//        SpringApplication.run(Springboot08ConfigurationApplication.class, args);
    }

}
