package com.jspring6;

public class ScopeAnnotation {
    public void ScopeAnnottionExample()
    {
        System.out.println("Scope Annotation Example in Java Based Config ");
    }
}

/*
 * 
 * 
 * 
// prototype bean
// AppConfig File
    @Bean
    @Scope("prototype")
    //@Bean(name = "comp1")
    // @Bean(name={"comp1", "cpmp2","jp"})
    public ConfigDesktop desktop() //  Using  the ConfigDesktop 

    // App.java File
    {

        ConfigDesktop dt2 = context.getBean(ConfigDesktop.class);
        dt2.compile();


        ConfigDesktop dt = context.getBean(ConfigDesktop.class);
        dt.compile();  // here bothe bean are working with the same obj 

        // to get the different bean obj  we have to use the @Scope anotation and  prototype 
 * 
 */

// use of the Scope Annotation


//  package com.jspring6;

// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Scope;
// import org.springframework.stereotype.Component;

// @Component
// // @primary
// @Scope("prototype")
// // @Qualifier("lap") to use the name as Bean for the autowire 
// public class Desktop implements Computer {

//     public Desktop()
//     {
//         System.out.println("Constructor ");
//     }

//     @Override
//     public void compile(){
//         System.out.println("Compiling in my Computer");
//     }
// }


// Use of the Value Anotation 

/*
 * 
 * 
@Component
public class AlienInterfaceConfig {

@Value("23")
private int age;
 */

//  * 
// // prototype bean
// // AppConfig File
//     @Bean
//     @Scope("prototype")
//     //@Bean(name = "comp1")
//     // @Bean(name={"comp1", "cpmp2","jp"})
//     public ConfigDesktop desktop() //  Using  the ConfigDesktop 

//     // App.java File
//     {

//         ConfigDesktop dt2 = context.getBean(ConfigDesktop.class);
//         dt2.compile();


//         ConfigDesktop dt = context.getBean(ConfigDesktop.class);
//         dt.compile();  // here bothe bean are working with the same obj 

//         // to get the different bean obj  we have to use the @Scope anotation and  prototype 
//  * 
//  */