package com.springboot.sf6sb3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// public class Laptop {
    public class Laptop1  implements Computer1{

   
    @Autowired
    VsCode1 codeEdit;

    public void compile(){
        System.out.println("Compiling the laptop code");
        codeEdit.Vside();
    }
}


// Database for the Laptop 