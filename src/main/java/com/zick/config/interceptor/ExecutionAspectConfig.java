package com.zick.config.interceptor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionAspectConfig {

    //aop 拦截Service结尾的任意类的任意方法参数
    @Pointcut("execution(public * com.zick.service.*Service.*(..))")
    public void matchCondition(){}

    @Before("matchCondition()")
    public void before(){
        System.out.println("test ExecutionAspectConfig");
    }

    @After("matchCondition()")
    public void after(){
        System.out.println("test after ExecutionAspectConfig");
    }
}
