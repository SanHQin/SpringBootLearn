package com.itgt.service.imlo;

import com.itgt.service.SendMailService;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class SendMailServiceImpl implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    //发送人
    private String from = "19128326542@163.com";
    //接收人
    private String to = "3343521716@qq.com";
    //标题
    private String subject = "测试邮件";
    //正文
    private String context = "<img src='https://w.wallhaven.cc/full/we/wallhaven-wempqq.jpg'><a href='https://www.baidu.com'>测试正文内容</a>";
    @Override
    public void sendMail() {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            //如果需要发附件，则第二个参数写true
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            message.setFrom(from + "(覃罡彤)");
            helper.setTo(to);
            helper.setSubject(subject);
            //如果需要发送HTML标签，则在第二个参数写ture
            helper.setText(context,true);
            //添加附件

            File f1 = new File("E:\\图片\\微信图片_20230726173952.jpg");
            helper.addAttachment("微信头像.jpg",f1);
            javaMailSender.send(message);
            System.out.println("发完了");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
