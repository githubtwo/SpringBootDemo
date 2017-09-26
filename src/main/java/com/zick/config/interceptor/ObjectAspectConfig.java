package com.zick.config.interceptor;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ObjectAspectConfig {

    @Pointcut("this(com.zick.controller.UserController)")
    public void matchType(){}

    @Before("matchType()")
    public void before(){
        System.out.println("test ObjectAspectConfig");
    }
}
