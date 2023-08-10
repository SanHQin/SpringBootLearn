package com.example;

import com.example.dao.studentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04MybatisApplicationTests {

    @Autowired
    private studentDao studentDao;
//    private studentDao studentDao;

    @Test
    void contextLoads() {
        System.out.println(studentDao.getByxh("201901766"));
    }

}
