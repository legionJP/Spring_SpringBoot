package com.jspring6;

import org.springframework.stereotype.Component;

// public class ConfigDesktop {

@Component
public class ConfigDesktop implements Computer {
    
    public ConfigDesktop()
    {
        System.out.println("Object Created ConfigDesktop");
    }

    public void compile(){
        System.out.println("Compiling in my Computer");
    }
}
