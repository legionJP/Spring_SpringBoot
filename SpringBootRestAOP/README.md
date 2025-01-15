# Spring AOP


# 1. Logging the Calls

```java


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class LoggingAspect {
    
    // if any  method is called maintain the logs 

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    public void logMethodCall()
    {
        LOGGER.info("Method Called");
    }
}
```