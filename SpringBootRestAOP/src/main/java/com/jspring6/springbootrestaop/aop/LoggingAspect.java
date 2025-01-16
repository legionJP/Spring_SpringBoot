package com.jspring6.springbootrestaop.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect  // so this is part of aspect 
public class LoggingAspect {
    
    // if any  method is called maintain the logs 

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

// Before  Returning 

// return type first , then class name full path, args  
    // @Before("execution(* *.*(..))")   // all the return type , all the class * and .* all the methods , (..) args 
    // @Before("execution(* com.jspring6.springbootrestaop.service.JobService.*(..))")
    // public void logMethodCall()
    // {
    //     LOGGER.info("Method Called");
    // }

// If want to target a particular method and want to hold on it it is called thr Join Point 

    @Before("execution(* com.jspring6.springbootrestaop.service.JobService.getJob(..)) || execution(* com.jspring6.springbootrestaop.service.JobService.load(..))")
    public void logMethodCall(JoinPoint jp)
    {
        LOGGER.info("Method Called "+ jp.getSignature().getName());
    }

// After Advice 
        
}


// to connect the method use the method which is  called  the weaving 