package com.springboot.sf6sb3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component          //make the component for telling the spring to create the obj for the IOC injection
public class DISpring {

    @Autowired   // to use this we need to wire the DISpring and Laptop Class
    Laptop laptop;
    
    public void code()
    {
        System.out.println("Spring is here ");
        laptop.compile();    // to use this we need to wire the DISpring and Laptop Class

    }
}
