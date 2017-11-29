package com.blue.boot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    MailService mailService;
    @Test
    public void sendSimpleMail() throws Exception {
        mailService.sendSimpleMail("378488249@qq.com","标题","内容");
    }

    @Test
    public void sendHtmlMail() throws Exception {
    }

    @Test
    public void sendAttachmentsMail() throws Exception {
    }

    @Test
    public void sendInlineResourceMail() throws Exception {
    }

}