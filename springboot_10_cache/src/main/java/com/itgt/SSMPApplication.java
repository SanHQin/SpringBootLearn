package com.itgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SSMPApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSMPApplication.class, args);
    }

}
