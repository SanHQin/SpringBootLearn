package com.itgt.controller.utils;

import lombok.Data;
import org.apache.ibatis.ognl.BooleanExpression;

import java.io.Serializable;

@Data
public class R implements Serializable {
    private Boolean code;
    private Object data;
    private String msg;

    public R(){}
    public R(Boolean code){
        this.code = code;
    }

    public  R(Boolean code,Object data){
        this.code = code;
        this.data = data;
    }

    public  R(Boolean code,String msg){
        this.code = code;
        this.msg = msg;
    }

}
