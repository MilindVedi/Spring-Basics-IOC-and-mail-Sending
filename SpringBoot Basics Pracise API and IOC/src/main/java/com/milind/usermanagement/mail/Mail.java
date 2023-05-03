package com.milind.usermanagement.mail;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
    public void sendMail(String message) {
        System.out.println("Sending Message");
        String from="milindvedi@gmail.com";
        String to="nkhlkmr17@gmail.com";
        String subject="Mail Send Check";
        String host="smtp.gmail.com";
        Properties properties=System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session=Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("milindvedi@gmail.com", "*******");
            }

        });
        MimeMessage m=new MimeMessage(session);
        try
        {
            m.setFrom(from);
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(subject);
            m.setText(message);

            Transport.send(m);
            System.out.println("Message Sent Successfully");
        }
        catch(Exception e)
        {
            System.out.println("Failed to send mail");
            e.printStackTrace();
        }
    }
}
