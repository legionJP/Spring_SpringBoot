package com.springboot.sf6sb3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sf6sb3Application {

    public static void main(String[] args) {
        SpringApplication.run(Sf6sb3Application.class, args);  // run return the obj of configuraableappobject and extends the Apllication context
        System.out.println("Hello Spring Boot!");

//object of DISpring
        // DISpring obj = new DISpring();
        // obj.code();

// Spring to create the object itself 

        ApplicationContext context = SpringApplication.run(Sf6sb3Application.class, args); // context 

        DISpring objDiSpring = context.getBean(DISpring.class); //getting the obj as obj is called Bean
        objDiSpring.code();

        // DISpring objDiSpring2 = context.getBean(DISpring.class);
        // objDiSpring2.code();    // are we getting the same obj or different obj

// When the DISpring is dependent on the other class object 

        // Laptop lap = context.getBean(Laptop.class);
        // lap.compile();   // we are able to use the complie in main bcz we have the container access using the bean

        
    }
}

// When want to use the object in the main use the Context obj 
// apart from the main whenever you want to create the obj or access you have to use the Component and 
// Autowired