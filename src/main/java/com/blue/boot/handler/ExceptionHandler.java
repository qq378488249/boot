package com.blue.boot.handler;

import com.blue.boot.domain.Response;
import com.blue.boot.exception.GirlRunTimeExcetion;
import com.blue.boot.service.MailService;
import com.blue.boot.util.ThreadPoolUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/**
 * 所有异常捕获类
 */
@ControllerAdvice
public class ExceptionHandler {

    @Autowired
    MailService mailService;

    //邮件接收人员
    @Value("${mailRecipients}")
    private String mailRecipient;

    @org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Response handler(Exception e){
        Response response = Response.newResponse();

        if(e instanceof GirlRunTimeExcetion){
            response.setCodeAndMessage(((GirlRunTimeExcetion) e).getCode(),e.getMessage());
        }else{
            response.setMessage(e.getMessage());
        }

        //发送邮件
        if (Objects.nonNull(mailRecipient)) {
            String[] strings = mailRecipient.split(",");
            for (String string : strings) {
                //使用线程进行发送邮件，避免网络延迟问题
                ThreadPoolUtil.execute(new Runnable() {
                    @Override
                    public void run() {
                        mailService.sendSimpleMail(string,"spring boot出现异常",e.getMessage());
                    }
                });
            }
        }
        return response;
    }
}
