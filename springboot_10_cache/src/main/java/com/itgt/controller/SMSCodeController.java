package com.itgt.controller;

import com.itgt.domain.SMSCode;
import com.itgt.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SMSCodeController {

    @Autowired
    private SMSCodeService smsCodeService;

    @GetMapping()
    public String getCode(String tel){
        return  smsCodeService.sendCodeToSMS(tel);
    }

    @PostMapping
    public boolean checkCode(SMSCode smsCode){
        return smsCodeService.checkTel(smsCode);
    }

}
