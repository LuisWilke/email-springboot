package br.com.luiseduardo.emailspringboot;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEail(Email email) {
        var message = new SimpleMailMessage();
        message.setFrom("noreply@mail.com");
        message.setTo(email.to());
        message.setSubject(email.subject());
        mailSender.send(message);
    }
}
