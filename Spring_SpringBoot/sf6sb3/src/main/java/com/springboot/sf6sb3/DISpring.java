package com.springboot.sf6sb3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component          
//make the component for telling the spring to create the obj for the IOC injection
public class DISpring {

    // @Autowired   // to use this we need to wire the DISpring and Laptop Class
    // Laptop laptop;
    
    // public void code()
    // {
    //     System.out.println("Spring is here ");
    //     laptop.compile();    
    //     // to use this we need to wire the DISpring and Laptop Class

    // }

// Annotation in Spring boot Notes: 

    @Autowired   // to use this we need to wire the DISpring and Laptop Class
    Laptop laptop;
    
    @Value("25")
    private int age;
    @Autowired
    private Computer com;
    public void code()
    {
        System.out.println("Spring is here ");
        com.compile();    

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")  // Still Desktop is primary but laptop is Qualifier than it will have the first priority 
    public void setCom(Computer com) {
        this.com = com;
    }
}
