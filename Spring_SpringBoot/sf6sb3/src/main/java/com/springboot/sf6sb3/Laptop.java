package com.springboot.sf6sb3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// public class Laptop {
    public class Laptop  implements Computer{

   
    @Autowired
    VsCode codeEdit;

    public void compile(){
        System.out.println("Compiling the laptop code");
        codeEdit.Vside();
    }
}
