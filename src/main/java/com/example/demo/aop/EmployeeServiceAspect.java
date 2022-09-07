package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class EmployeeServiceAspect {
    private Logger logger= LoggerFactory.getLogger(EmployeeServiceAspect.class);

    @Before("execution(* com.example.demo.service.impl.EmployeeServiceImpl.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Before called "+joinPoint.toString());
    }

    @After("execution(* com.example.demo.service.impl.EmployeeServiceImpl.*(..))")
    public void after(JoinPoint joinPoint){
        logger.info("After called "+joinPoint.toString());
    }

    @AfterThrowing("execution(* com.example.demo.service.impl.EmployeeServiceImpl.*(..))")
    public void afterThrowing(JoinPoint joinPoint){
        logger.error("Error when call "+joinPoint.toString());
    }
}
