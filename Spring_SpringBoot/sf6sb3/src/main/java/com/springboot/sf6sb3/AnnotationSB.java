package com.springboot.sf6sb3;
       
//make the component for telling the spring to create the obj for the IOC injection
public class AnnotationSB {
   public void Note()
   {
    System.out.println("Notes Spring Boot Annotation ");
   }
}

// Class to look for DISpring

// @Autowired   // to use this we need to wire the DISpring and Laptop Class
// Laptop laptop;

// @Value("25")
// private int age;
// @Autowired
// private Computer com;
// public void code()
// {
//     System.out.println("Spring is here ");
    // com.compile();    

// }
// public int getAge() {
//     return age;
// }
// public void setAge(int age) {
    // this.age = age;
// }
// public Computer getCom() {
//     return com;
// }

// @Autowired
// @Qualifier("laptop")  // Still Desktop is primary but laptop is Qualifier than it will have the first priority 
// public void setCom(Computer com) {
    // this.com = com;
// }
// }


//2. Desktop
// 
// package com.springboot.sf6sb3;
// 
// import org.springframework.context.annotation.Primary;
// import org.springframework.stereotype.Component;
// 
// @Component
// @Primary
// public class Desktop implements Computer{
    // 
    // public void compile()
    // {
        // System.out.println("Compiling in the Desktop");
    // }
// }
// 

//3. Computer Interface 