package com.itgt.service.impl;

import com.itgt.service.MsgService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MsgServiceImpl implements MsgService {

    private HashMap<String,String> cache = new HashMap<String,String>();
    @Override
    public String getCode(String tel) {
        String code =  tel.substring(tel.length()-6);
        cache.put(tel,code);
        return code;
    }

    @Override
    public Boolean checkCode(String tel, String code) {
        try {
            String queryCode = cache.get(tel);
            if(queryCode.equals(code)){
                cache.remove(tel);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }

    }
}
