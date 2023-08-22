package com.itgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//开启定时任务功能
@EnableScheduling
public class Springboot12TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot12TaskApplication.class, args);
    }

}
