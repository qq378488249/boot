package com.blue.boot.handler;

import com.blue.boot.domain.Response;
import com.blue.boot.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 所有异常捕获类
 */
@ControllerAdvice
public class ExceptionHandler {

    @Autowired
    MailService mailService;

    @org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Response handler(Exception e){
        Response response = Response.newResponse();
//        if(e instanceof GirlRunTimeExcetion){
//            response.setCodeAndMessage(((GirlRunTimeExcetion) e).getCode(),e.getMessage());
//        }else{
//            response.setMessage(e.getMessage());
//        }
        mailService.sendSimpleMail("378488249@qq.com","标题",e.getMessage());
        return response;
    }
}
