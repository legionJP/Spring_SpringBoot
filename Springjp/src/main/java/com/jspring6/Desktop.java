package com.jspring6;

import org.springframework.stereotype.Component;

@Component
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

