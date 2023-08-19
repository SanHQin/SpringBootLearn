package com.itgt.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.itgt.domain.SMSCode;
import com.itgt.service.SMSCodeService;
import com.itgt.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;

    //remote远程方案
//    @CreateCache(name="smsCode::",expire = 100,timeUnit = TimeUnit.SECONDS)
    @CreateCache(name="smsCode::",expire = 100,timeUnit = TimeUnit.SECONDS,cacheType = CacheType.LOCAL)
    private Cache<String,String> jetCache;

    @Override
//    @CachePut(value = "smsCode",key = "#tel")
    public String sendCodeToSMS(String tel) {
        String code = codeUtils.generator(tel);
        jetCache.put(tel,code);
        return code;
    }

    @Override
    public Boolean checkTel(SMSCode smsCode) {
        //取出内存中的验证码与传递过来的验证码比对，如果相同，返回true
        String code = jetCache.get(smsCode.getTel());
        return smsCode.getCode().equals(code);
    }
}
