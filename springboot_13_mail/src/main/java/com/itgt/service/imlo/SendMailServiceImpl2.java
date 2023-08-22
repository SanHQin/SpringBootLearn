package com.itgt.service.imlo;

import com.itgt.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//@Service
public class SendMailServiceImpl2 implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    //发送人
    private String from = "3343521716@qq.com";
    //接收人
    private String to = "19128326542@163.com";
    //标题
    private String subject = "测试邮件";
    //正文
    private String context = "测试正文内容";
    @Override
    public void sendMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from+"(覃罡彤)");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(context);

        javaMailSender.send(message);
    }
}
