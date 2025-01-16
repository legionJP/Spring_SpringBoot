package com.jspring6.springbootrestaop.aop;

import org.slf4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitoringAspect {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitoringAspect.class);
    
    // @Around("execution(* com.jspring6.springbootrestaop.service.JobService.getJob(..))") // .. means to accept any num of args
    @Around("execution(* com.jspring6.springbootrestaop.service.JobService.getJob(..))") // .. means to accept any num of args

    public Object Monitorlog(ProceedingJoinPoint jp) throws Throwable  // joinPoint for executing the methods
        {
            long start = System.currentTimeMillis();
            //specify to call the method
           Object obj = jp.proceed();
            
            long end = System.currentTimeMillis();

            // LOGGER.info("Time Taken "+ (end-start) + "ms");
            LOGGER.info("Time Taken "+jp.getSignature().getName() + " : "+ (end-start) + "ms");

            // will get the output when retrun the object 
            return obj;
        }
}
