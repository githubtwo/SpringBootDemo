package com.zick.config.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PkgTypeAspectConfig {

    /*@Pointcut("within(com.zick.service.UserService)")
    public void mathchType(){}

    @Before("mathchType()")
    public void before(){
        System.out.println("just is testing....");
    }*/
}
