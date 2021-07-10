package com.ashok.it.demo.user.management.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class MailUtil{

	@Autowired
    private JavaMailSender JavaMailSender;
    
    public void sendEmail(String to, String sub, String body) {

        SimpleMailMessage msg = new SimpleMailMessage( );
        msg.setTo(to);

        msg.setSubject(sub);
        msg.setText(body);

        JavaMailSender.send(msg);

    }
}
