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
 * 
 * 
 * package com.jspring6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.jspring6")
public class AlienInterfaceConfig {
   

// comment all the implementations 

}
 * 
 */