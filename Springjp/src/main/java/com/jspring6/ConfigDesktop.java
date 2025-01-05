package com.jspring6;

// public class ConfigDesktop {

public class ConfigDesktop implements Computer {
    
    public ConfigDesktop()
    {
        System.out.println("Object Created ConfigDesktop");
    }

    public void compile(){
        System.out.println("Compiling in my Computer");
    }
}
