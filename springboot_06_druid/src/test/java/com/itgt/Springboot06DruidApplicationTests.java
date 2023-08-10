package com.itgt;

import com.itgt.dao.studentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06DruidApplicationTests {

    @Autowired
    private studentDao studentDao;

    @Test
    void contextLoads() {
        System.out.println(studentDao.getByxh("201901767"));
    }

}
