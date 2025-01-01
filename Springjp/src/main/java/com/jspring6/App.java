package com.jspring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

//        AlienSpring alienobj = new AlienSpring();
//        alienobj.code();

       // 1. creating the obj with the help of Spring , Spring have the IOC Container

       //  ApplicationContext to use we have to add the dependencies or external packages using the spring
        // context in the pom.xml , can use from the maven web repository
        // the application context is superset of the bin factory

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //ClassPathXmlApplicationContext("applicationContext.xml");
        // So spring will create the obj for the class mentioned in the xml

        AlienSpring alienobj2 =  (AlienSpring) context.getBean("alien");

        alienobj2.age = 21; // if the age obj is different then it will print the different age for the both obj
        System.out.println(alienobj2.age);
        AlienSpring alienobj1 =  (AlienSpring) context.getBean("alien"); 
        // it will only get the one object not the two
        System.out.println(alienobj1.age); //same obj reference if bean is singleton diff if bean is prototype

        //Laptop laptopobj2 = (Laptop) context.getBean("lap");
        // here got the reference of the obj fromm the container
        // get bean provide the obj from the container but type is Object so need to do typecasting into alienSpringclass
        alienobj2.code();
        alienobj1.code();

    }
}


// Scope of the Object for the Bean

// Any bean has different scope in the spring : Singleton , prototype, (and Request , Session)
// by default the bean refers to the same obj and only get the obj .
// bcz the obj scope is same

// prototype Scope:
// so if the scope = prototype is mentioned in the bean it will create the different obj every time
