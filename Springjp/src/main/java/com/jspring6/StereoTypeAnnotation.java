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

// In the alienInterfaceConfig the oj is created for the ag and others and by default the com1
is null 

So we have to autowire the Computer obj com
@Autowired
Private Computer com1


// But if there is more method which impelments the Computer ,
// It will give the  error



Network.beans.factory.UnsatisfiedDependencyException: 
Error creating bean with name 'alienInterfaceConfig': Unsatisfied dependency expressed through field 'com1': No qualifying bean of type 'com.jspring6.Computer' available: expected single matching bean but found 3

# Use the Quallifier as below

// // package com.jspring6;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.stereotype.Component;

// @Component
// public class AlienInterfaceConfig {
    
// private int age;
// // private ConfigDesktop com1;
// @Autowired
// @Qualifier("laptop")
// private Computer com1;

// @Autowired
// private ConfigDesktop lap;
// private Laptop laptoplap;


// // constructor
// public AlienInterfaceConfig() {
//     System.out.println("Alien Interface obj created");
// }

// public void coding() {
//     System.out.println("Alien config Interface coding Now ");
//     com1.compile();  
//     // lap.compile();
// }

// public int getAge() {
//     return age;
// }

// public void setAge(int age) {
//     this.age = age;
// }

// public Computer getCom() {
//     return com1;
// }

// public void setCom(Computer com12) {
//     this.com1 = com12;
// }

// public ConfigDesktop getLap() {
//     return lap;
// }

// public void setLap(ConfigDesktop lap) {
//     this.lap = lap;
// }

// public Laptop getLaptoplap() {
//     return laptoplap;
// }

// public void setLaptoplap(Laptop laptoplap) {
//     this.laptoplap = laptoplap;
// }



// }

*/