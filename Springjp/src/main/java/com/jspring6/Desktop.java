package com.jspring6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@primary
// @Qualifier("lap") to use the name as Bean for the autowire 
public class Desktop implements Computer {

    public Desktop()
    {
        System.out.println("Constructor ");
    }

    @Override
    public void compile(){
        System.out.println("Compiling in my Computer");
    }
}

