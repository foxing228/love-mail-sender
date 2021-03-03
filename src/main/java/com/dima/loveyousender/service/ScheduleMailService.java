package com.dima.loveyousender.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ScheduleMailService {

    @Value("${send.to}")
    private String to;

    @Value("${send.subject}")
    private String subject;

    @Value("${send.text}")
    private String text;

    private final EmailSenderService emailSenderService;

    @Autowired
    public ScheduleMailService(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @Scheduled(cron = "0 0 9 * * ?" )
    public void sendEmailToUser() {
        emailSenderService.sendMail(to, subject, text);
        emailSenderService.sendMail("g.prokhorchuk@gmail.com", "Сообщение АНЕ отправленно", "ОТПРАВЛЕННО");
    }


}

