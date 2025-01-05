package com.jspring6;

import org.springframework.stereotype.Component;

// public class Laptop
@Component
public class Laptop implements Computer 

{
    public Laptop() {
        System.out.println("Laptop Constructor");
    }
    public void compile()
    {
        System.out.println("compiling in My laptop ");

    }
}