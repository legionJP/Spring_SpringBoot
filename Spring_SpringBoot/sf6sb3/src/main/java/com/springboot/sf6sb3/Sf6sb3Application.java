package com.springboot.sf6sb3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.sf6sb3.model.DISpring1;
import com.springboot.sf6sb3.model.Laptop1;
import com.springboot.sf6sb3.service.LaptopService;

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

        DISpring objDiSpring = context.getBean(DISpring.class); 
        //getting the obj as obj is called Bean
        objDiSpring.code();
        System.out.println(objDiSpring.getAge());

// Spring context for model package 

        DISpring1 objDiSpring1 = context.getBean(DISpring1.class); 
        //getting the obj as obj is called Bean
        objDiSpring1.code();
        System.out.println(objDiSpring1.getAge());

        // DISpring objDiSpring2 = context.getBean(DISpring.class);
        // objDiSpring2.code();    // are we getting the same obj or different obj


        
// When the DISpring is dependent on the other class object : like model 

        // Laptop lap = context.getBean(Laptop.class);
        // lap.compile();   // we are able to use the complie in main bcz we have the container access using the bean

        LaptopService service = context.getBean(LaptopService.class);
        Laptop1 lap = context.getBean(Laptop1.class);

        // saving the data using the service 
        service.addLaptop(lap);

        // if we want to store the JDBC in the database need to create in the database


        
    }
}

// When want to use the object in the main use the Context obj 
// apart from the main whenever you want to create the obj or access you have to use the Component and 
// Autowired