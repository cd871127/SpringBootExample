package com.anthony.controller;


import com.anthony.mail.MailConfig;
import com.anthony.mail.MailServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @Resource
    private MailServer mailServer;
    @Resource
    private MailConfig mailConfig;

    @Value("${mail.client.sender}")
    private String sender;

    @RequestMapping("helloWorld")
    public String helloWorld() {
        return mailConfig.toString();
    }

    @RequestMapping("sendmail/{subject}/{text}")
    public String sendMail(@PathVariable String subject, @PathVariable String text) {
        String[] to = {"61666731@qq.com"};
        try {
            mailServer.sendMail(subject, text, sender, to);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
