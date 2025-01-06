package com.jspring6;

public class StereoTypeAnnotation {
    public void atAnnotation()
    {
        System.out.println(" stereotype Annotation Note: ");
    }
}

/*
 * 1. use @component  for the very method or class dependent on the AlienInterfacing
 * 2. use the @ComponentScan for finding the method in the package 
 * // comment all the implementations 

 * 
 * package com.jspring6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("com.jspring6")
public class AppConfig {

\\ No need to implement the bean the bean will search for the mwthod where component is mentioned 



// this is giving the error of , Exception in thread "main" java.lang.NullPointerException:
// Cannot invoke "com.jspring6.Computer.compile()" because "this.com1" is null

}


 * 
 */