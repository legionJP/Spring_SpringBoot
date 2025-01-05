package com.jspring6.javabasedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.jspring6.AlienInterfaceConfig;
import com.jspring6.ConfigDesktop;
import com.jspring6.Computer;



@Configuration
public class AppConfig {
    
    // Alien Interface Config 
    // @Bean
    // public AlienInterfaceConfig alienInterfaceConfig(){
    //    AlienInterfaceConfig obj = new AlienInterfaceConfig();
    //    obj.setAge(25);
    //    obj.setCom(desktop()); // when we assgn the desktop here we making it tightly coupled 
    //     return obj;
        // return new AlienInterfaceConfig();

    // Autowiring the Computer class which is implements of of ConfigDesktop 

        @Bean
        public AlienInterfaceConfig alienInterfaceConfig(@Autowired Computer com1){
        AlienInterfaceConfig obj = new AlienInterfaceConfig();
        obj.setAge(25);
        obj.setCom(com1); // when we assgn the desktop here we making it tightly coupled 
            return obj;
        
        // return new AlienInterfaceConfig();
    }

    @Bean
   // @Scope("prototype")
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