package com.blue.boot.aspect;

import com.blue.boot.service.GirlService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Aspect
@Component
public class GirlAspect {
    org.slf4j.Logger logger = LoggerFactory.getLogger(GirlAspect.class);

    @Autowired
    private GirlService girlService;

    @Pointcut("execution(public * com.blue.boot.controller.GirlController.*(..))")
    public void log() {
        //切入点并不会进入,所以打印日志无效
        System.out.println("Pointcut");
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        System.out.println("url="+request.getRequestURL());
        System.out.println("ip="+request.getRemoteAddr());
        System.out.println("method="+joinPoint.getStaticPart().getSignature().getDeclaringTypeName()+" "+joinPoint.getSignature().getName());
        System.out.println("args="+joinPoint.getArgs());

        HttpSession session =request.getSession();

        String methodName = joinPoint.getSignature().getName();
        switch (methodName){
            case "add":
                String login = (String) session.getAttribute("login");
                if (login == null) {
                    throw new RuntimeException("请先登录!");
                }
                break;
        }

//        joinPoint.proceed();
    }

    @After("log()")
    public void zs() {
        System.out.println("after");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterRuturn(Object object){
        logger.info(object.toString());

    }
}
