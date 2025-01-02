package com.jspring6;

public class LazyInitBean {
    public LazyInitBean(){
        System.out.println("Obj of the lazy init created ");
    }
}


// ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
// By default the above will create the obj of bean if the it is not even used first time 


// So only  the object  to be created when the it is used , apply the true for it 
// <bean id="lazybean" class="com.jspring6.LazyInitBean" lazy-init="true"> 

// And the object will be created when you wanted like: creating the getbean boj in main class

// if the eager bean obj means non lazy bean is dependent on the lazy bean than the obj of the lazy 
//bena will be created 



// 2. getBean by Type 

// AlienSpring alienobj1 =  (AlienSpring) context.getBean("alien"); 
// here the getbean is getting the obj from the conatiner of the objtype so we are typecating it 
// into the AlienSpring  class obj type

// So to avoid the type casing we can mention the class 

// AlienSpring alienobj1 =  context.getBean("alien", AlienSpring.class); 



