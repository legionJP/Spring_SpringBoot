package com.springboot.sf6sb3.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop1 implements Computer1{
    
    public void compile()
    {
        System.out.println("Compiling in the Desktop");
    }
}
