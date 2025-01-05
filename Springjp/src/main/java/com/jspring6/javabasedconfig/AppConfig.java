package com.jspring6.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.jspring6.ConfigDesktop;

@Configuration
public class AppConfig {
    
    @Bean
    @Scope("prototype")
    //@Bean(name = "comp1")
    // @Bean(name={"comp1", "cpmp2","jp"})
    public ConfigDesktop desktop() //  Using  the ConfigDesktop 
    {
        return new ConfigDesktop(); 
         // creating the obj but not injecting the obj and the Spring is creating and injecting the obj 
        // all things is done by spring create manage , inject , it look for the type of Desktop Bean
    }
}

// In the App.Java Put the context of the java based config 
/*
 * 
 * // 2. java Config Based Config : 

        ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigDesktop dt = context.getBean(ConfigDesktop.class);
        dt.compile();

 * by default all the beans are singelton 
 */