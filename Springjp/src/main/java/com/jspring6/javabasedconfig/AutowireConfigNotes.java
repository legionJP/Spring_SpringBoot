package com.jspring6.javabasedconfig;

public class AutowireConfigNotes {
    
}

   
    // Alien Interface Config 
    // @Bean
    // public AlienInterfaceConfig alienInterfaceConfig(){
    //    AlienInterfaceConfig obj = new AlienInterfaceConfig();
    //    obj.setAge(25);
    //    obj.setCom(desktop()); // when we assgn the desktop here we making it tightly coupled 
    //     return obj;
        // return new AlienInterfaceConfig();

    // Autowiring the Computer class which is implements of of ConfigDesktop 
// in AppConfig 
    // @Bean
    // public AlienInterfaceConfig alienInterfaceConfig(@Autowired Computer com1){
    // AlienInterfaceConfig obj = new AlienInterfaceConfig();
    // obj.setAge(25);
    // obj.setCom(com1); // when we assgn the desktop here we making it tightly coupled 
    //     return obj;
    
    // return new AlienInterfaceConfig();

// App.java

// // Autowire for config based 
// AlienInterfaceConfig obj1 = context.getBean(AlienInterfaceConfig.class);
// //  obj1.setAge(21);
//   System.out.println(obj1.getAge());

//   obj1.coding();
//   obj1.getAge();

// see the ref of AlienInterfaceConfig 