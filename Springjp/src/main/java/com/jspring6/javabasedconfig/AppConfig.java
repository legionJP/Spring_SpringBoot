package com.jspring6.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jspring6.ConfigDesktop;

@Configuration
public class AppConfig {
    
    @Bean
    public ConfigDesktop desktop()
    {
        return new ConfigDesktop(); 
         // creating the obj but not injecting the obj the Spring is creating and injecting the obj 
        // all things is done by spring create manage , inject , it look for the type of Desktop Bean
    }
}

// In the App . Java Put the context of the java based config 