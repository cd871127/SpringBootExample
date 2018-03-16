package com.anthony.mail;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class MailServer {

    @Resource
    private MailConfig mailConfig;

    private Session session;

    @PostConstruct
    private void init() {
        Properties props = new Properties();
        // 开启debug调试
        props.setProperty("mail.debug", mailConfig.getDebug());
        // 发送服务器需要身份验证
        props.setProperty("mail.smtp.auth", mailConfig.getAuth());
        // 设置邮件服务器主机名
        props.setProperty("mail.host", mailConfig.getServer());
        // 发送邮件协议名称
        props.setProperty("mail.transport.protocol", mailConfig.getProtocol());
        // 设置环境信息
        session = Session.getInstance(props);
    }

    public void sendMail(String subject, String text, String from, String[] to) throws MessagingException {
        // 创建邮件对象
        Message msg = new MimeMessage(session);
        msg.setSubject(subject);
        // 设置邮件内容
        msg.setText(text);
        // 设置发件人
        msg.setFrom(new InternetAddress(from));
        Transport transport = session.getTransport();
        // 连接邮件服务器
        transport.connect(mailConfig.getUsername(), mailConfig.getPassword());
        // 发送邮件
        transport.sendMessage(msg, new Address[]{new InternetAddress(to[0])});
        // 关闭连接
        transport.close();
    }
}