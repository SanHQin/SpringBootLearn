package com.itgt.service;

import com.itgt.domain.SMSCode;

public interface SMSCodeService {
    public String sendCodeToSMS(String tel);
    public Boolean checkTel(SMSCode smsCode);
}
