# View Resolver 
- Put the views in the  /src/main/webapp/views/index.jsp
- and the css can be in the webapp dir or in the static in resources 

# 1. Using the Application Properties 
- application -properties 
```
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp

```

# 2. Using the config directory 
- Put the views in the  /src/main/webapp/WEB-INF/views/index.jsp

```
Put the config folder inside the ;
com.jspring6.springbootwebapp1.HomeController folder ;
and create file as WebConfig;
```
```
package com.jspring6.springbootwebapp1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
```