package com.itgt.service.impl;

import com.itgt.domain.SMSCode;
import com.itgt.service.SMSCodeService;
import com.itgt.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;
    @Override
    @CachePut(value = "smsCode",key = "#tel")
    public String sendCodeToSMS(String tel) {
        return codeUtils.generator(tel);
    }

    @Override
    public Boolean checkTel(SMSCode smsCode) {
        //取出内存中的验证码与传递过来的验证码比对，如果相同，返回true
        String code = smsCode.getCode();
        String checkCode = codeUtils.getCode(smsCode.getTel());
        return code.equals(checkCode);
    }
}
