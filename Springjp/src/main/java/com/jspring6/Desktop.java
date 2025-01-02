package com.jspring6;

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

