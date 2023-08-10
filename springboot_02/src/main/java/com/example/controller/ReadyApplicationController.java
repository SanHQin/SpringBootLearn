package com.example.controller;

import com.example.config.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class ReadyApplicationController {

    @Value("${name}")
    private String name;

    //使用自动装配将所有的数据装到一个对象Environment中
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource dataSource;

    @GetMapping
    public String getValue(){
        System.out.println("输出application"+dataSource);
        return dataSource.toString();
    }
}
