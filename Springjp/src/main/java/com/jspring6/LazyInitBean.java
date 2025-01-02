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

//1.
// AlienSpring alienobj1 =  (AlienSpring) context.getBean("alien"); 
// here the getbean is getting the obj from the conatiner of the objtype so we are typecating it 
// into the AlienSpring  class obj type

// 2. So to avoid the type casing we can mention the class 

// AlienSpring alienobj1 =  context.getBean("alien", AlienSpring.class); 

// 3. If we dont want the name of the bean id as well 
//  AlienSpring alienobj1 =  context.getBean(AlienSpring.class); 
// so we dont have to mention the name of the bean id in the xml
// <bean class="com.jspring6.AlienSpring">

// if we use the the Interface and then the interface is being implemented by the two class
// than it will give the error 
//  AlienSpring alienobj1 =  context.getBean(Computer.class); // ten we have to mention the primary type 



// 3. Inner Bean 

/*
 * // Here the Desktop bean is available to the whole or other class like the AlienInterface is ref to it 
 *  <bean id="computer" class="com.jspring6.Desktop"> 
    </bean>  
 * 
 *  <bean id="alienif" class="com.jspring6.AlienInterface">
    <property name="com" ref="computer"></property> 
 * 
 * So if we want to limi it and want to use it only by the AlienInterface we can put it inside the property tag
 * 
 *  <bean id="alienif" class="com.jspring6.AlienInterface">
    <property name="com">
    <bean id="computer" class="com.jspring6.Desktop primary type="true"> 
    </bean> 
    </property> 
 * 
 * 
 */
