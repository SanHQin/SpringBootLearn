package com.itgt.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CodeUtils {
    private String [] patch = {"00000","0000","000","00","0",""};
    public String generator(String tel){
        int hash = tel.hashCode();
        int encryption = 20040226;
        long result = hash ^ encryption;
        long nowTime = System.currentTimeMillis();
        result = hash ^ nowTime;
        long code = result % 100000;
        code = code < 0 ? -code : code;
        String codeStr = code +"";
        return patch[codeStr.length()-1]+codeStr;
    }

    @Cacheable(value = "smsCode",key = "#tel")
    public String getCode(String tel){
        return  null;
    }

//    public static void main(String[] args){
//        System.out.println(new CodeUtils().generator("19128326542"));
//    }
}
