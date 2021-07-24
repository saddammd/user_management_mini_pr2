package com.ashok.it.demo.user.management.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailUtil{

	@Autowired
    private JavaMailSender javaMailSender;
	
	
    public void sendEmail(String to, String sub, String body) throws MessagingException {

    	MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			mimeMessageHelper.setSubject(sub);
			mimeMessageHelper.setTo(to);
			mimeMessageHelper.setText(body, true);
			javaMailSender.send(mimeMessageHelper.getMimeMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
}
