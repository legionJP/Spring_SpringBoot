# Spring AOP

# AOP Concept 
### [AOP Concept Link](https://docs.spring.io/spring-framework/reference/core/aop/introduction-defn.html)

```markdown

- AOP complement the OOP.

# Need of AOP
- it solves the problem of cross cutting concern 
- We need to write a lot of lines of code , but for big app we need to focus more on the
application bussiness logic ,
- when you are doing a lot of processing you need to maintain like
// log
// sec
// validation 

- if all above things are written in one file it will be hard to maintain the things.
// in Spring AOP the all of the above methods will be called automatically

```

# Understanding AOP Concepts

### Aspect :
```markdown
 The key unit of modularity in AOP, representing a concern that cuts across multiple classes. For example, an aspect for logging can be applied across various methods in different classes.
 ```
### Advice : 
```
This is the action taken by an aspect at a particular join point. There are five types of advice:
```

### Before :
```
Executed before the method call.
After : Executed after the method call, regardless of its outcome.
```

### AfterReturning : 
```markdown
Executed after the method returns a result, but not if an exception occurs.
Around : Surrounds the method execution, allowing you to control the method execution and its result.
AfterThrowing : Executed if the method throws an exception.
```
Advice in AOP
![alt text](image.png)

### Join Point :
```
 A specific point in the execution of a program, such as method execution or exception handling, where an aspect can be applied.
```

# Pointcut : 
```
A predicate that matches join points. A pointcut expression specifies where an advice should be applied.
```
# Weaving : 
```
The process of linking aspects with the target object. Weaving can occur at compile-time, load-time, or runtime. Spring AOP performs runtime weaving using proxy-based mechanisms.
```

# Dominant AOP Frameworks

```
AspectJ : A powerful and mature AOP framework that supports compile-time and load-time weaving. It offers full AOP support with its own syntax and tools.

JBoss AOP : Part of the JBoss application server, offering integration with Java EE applications.

Spring AOP : A simpler, proxy-based framework that integrates with the Spring Framework, using XML configurations or annotations to define aspects and pointcuts.

```

# 1. Logging the Calls


#### 2.Before Advice 

- `Aspect` - LoggingAspect
- `Advice` - @Before 


```java


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class LoggingAspect {
    
    // if any  method is called maintain the logs 

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);


// Before  Returning 

// return type first , then class name full path, args  
    // @Before("execution(* *.*(..))")   // all the return type , all the class * and .* all the methods , (..) args 
    @Before("execution(* com.jspring6.springbootrestaop.service.JobService.*(..))")
    public void logMethodCall()
    {
        LOGGER.info("Method Called");
    }
}
```

#### 2. Joint Point 

- If you want to target a particular method and want to hold on it it is called thr Join Point 

```java

 @Before("execution(* com.jspring6.springbootrestaop.service.JobService.getJob(..)) || execution(* com.jspring6.springbootrestaop.service.JobService.load(..))")
    public void logMethodCall(JoinPoint jp)
    {
        LOGGER.info("Method Called "+ jp.getSignature().getName());
    }

```

### 3. After Advice 

```java


// After Advice (finally )

    @After("execution(* com.jspring6.springbootrestaop.service.JobService.getJob(..)) || execution(* com.jspring6.springbootrestaop.service.JobService.load(..))")
    public void logMethodExecution(JoinPoint jp)
    {
        LOGGER.info("Method Executed "+ jp.getSignature().getName());
    }

```

- 2. // After Throwing (Only called when there is Exception )

```java

    @AfterThrowing("execution(* com.jspring6.springbootrestaop.service.JobService.getJob(..)) || execution(* com.jspring6.springbootrestaop.service.JobService.load(..))")
    public void logMethodCrash(JoinPoint jp)
    {
        LOGGER.info("Method has some issue "+ jp.getSignature().getName());
    }
```

- 3 .// After Returning (when there is no exceptions)

```java

    @AfterReturning("execution(* com.jspring6.springbootrestaop.service.JobService.getJob(..)) || execution(* com.jspring6.springbootrestaop.service.JobService.load(..))")
    public void logMethodSuccess(JoinPoint jp)
    {
        LOGGER.info("Method successfully Executed "+ jp.getSignature().getName());
    }

```

# 4. performance Monitoring Using Around Advice 

- #### [PerFormance Monitoring Around Advice ](src/main/java/com/jspring6/springbootrestaop/aop/PerformanceMonitoringAspect.java) 

#  5. Validating Input Using Around Advice 


```markdown

Changing the input before sending to the server request or checking the Request 

```
- ### [Validation Monitoring using Around](src/main/java/com/jspring6/springbootrestaop/aop/ValidationAscpect.java)