package com.jspring6.springbootrestaop.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAscpect {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAscpect.class);

    @Around("execution(* com.jspring6.springbootrestaop.service.JobService.getJob(..)) && args(postId)") 
    public Object ValidateAndUpdate(ProceedingJoinPoint jp, int postId) throws Throwable
    {

        // check for postid
        if(postId <0)
        {   LOGGER.info("Post Id is negetive");
            postId = -postId;
            LOGGER.info("new value " +postId);
        }
        
        Object obj =jp.proceed( new Object[]{postId});
        return obj;
    }

}