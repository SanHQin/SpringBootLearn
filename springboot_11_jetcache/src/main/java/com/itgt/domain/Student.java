package com.itgt.domain;


import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private String id;
    private String xh;
    private String xm;
    private String password;
    private String idno;
    private String xb;
    private String xy;
    private String zymc;
    private String xzb;
    private String rxrq;
    private String tel;
    private String email;
}
