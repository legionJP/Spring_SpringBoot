package com.jspring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspring6.javabasedconfig.AppConfig;

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
//---------------------------------------------------------------------------------------------------------------------------

// 1. XML Based Config : 

//         ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//         //ClassPathXmlApplicationContext("applicationContext.xml");
//         // So spring will create the obj for the class mentioned in the xml

//         AlienSpring alienobj2 =  (AlienSpring) context.getBean("alien");

//         alienobj2.age = 21; 
//         // if the age obj is different then it will print the different age for the both obj
//         System.out.println(alienobj2.age);

//         AlienSpring alienobj1 =  (AlienSpring) context.getBean("alien"); 
//         // it will only get the one object not the two
//         System.out.println(alienobj1.age); 
//         //same obj reference if bean is singleton diff if bean is prototype

//         //Laptop laptopobj2 = (Laptop) context.getBean("lap");
//         // here got the reference of the obj fromm the container
//         // get bean provide the obj from the container but type is Object so need to do typecasting into alienSpringclass
        
//         ConstructorInjection objiInjection =(ConstructorInjection) context.getBean("constinject");
//         AlienInterface objAlienInterface = (AlienInterface) context.getBean("alienif");
//        // LazyInitBean objLazy = (LazyInitBean) context.getBean("lazybean"); // singleton and obj created for

//         alienobj2.code();
//         alienobj1.code();
//         objiInjection.code();
//         objAlienInterface.coding();


// // Part 5. Setter Injection 

//         // alienobj1.setAge(22);  // if don't want to assign the value here , than can assign in the core AlienSpring.java
//         System.out.println(alienobj2.getAge());  // print 23 from the .xml

//     //2. or can  Inject the value in the spring.xml , Using the property 
//     // this is called the setter injection bcz we are calling the setter method to assign the value

        
// // Part 6. Ref Attribute Injection: 
// // AlienSpring Class , creating the lap obj and getter setter 
// // spring.xml: using the ref attribute 
// // <property name="lap" ref="lap1"></property>  <!-- Here we have to wire the obj as it is already created by bean , give the ref of bean id obj -->

//---------------------------------------------------------------------------------------------------------------------------
// 2. java Config Based Config : 

        ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class); //Specifying the type
        // ConfigDesktop dt = context.getBean(ConfigDesktop.class);
        // dt.compile();

        // Bean name: 
        ConfigDesktop dt1 = context.getBean("desktop", ConfigDesktop.class);
       // ConfigDesktop dt1 = context.getBean("comp1", ConfigDesktop.class);
        dt1.compile();


        // Here By default the Bean Name is the Name of the Method so we have to use the method name desktop from appconfig.java
        // can give the name as arg to @Bean(name="com1") or multiple name as arrays and put the name in .getbean 

// prototype bean see the Scope Annotation class file

// Autowire for config based 
        AlienInterfaceConfig obj1 = context.getBean(AlienInterfaceConfig.class);
      //  obj1.setAge(21);
        System.out.println(obj1.getAge());

        obj1.coding();
        obj1.getAge();


        


    }
}


// Scope of the Object for the Bean

// Any bean has different scope in the spring : Singleton , prototype, (and Request , Session)
// by default the bean refers to the same obj and only get the obj .
// bcz the obj scope is same

// prototype Scope:
// so if the scope = prototype is mentioned in the bean it will create the different obj every time
