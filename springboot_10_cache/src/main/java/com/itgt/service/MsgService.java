package com.itgt.service;

public interface MsgService {
    public String getCode(String tel);
    public Boolean checkCode(String tel,String code);
}
