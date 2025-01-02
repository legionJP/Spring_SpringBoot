package com.jspring6;

public class AlienInterface {


    private int age;
    private Computer com;
    private Laptop lap;

    // constructor
    public AlienInterface() {
        System.out.println("AlienSpring obj created");
    }

    public void coding() {
        System.out.println("Alien Interface coding Now ");
        com.compile();  
        lap.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

  

}

/*
 * 
 * Auto wiring the Bean interfsace obj 
<!--  

<!-- Defining the computer bean of concrete class -->
    <bean id="com" class="com.jspring6.Desktop" autowire="byName"> 
    </bean>  

<!-- Defining the computer bean of concrete class -->

    <bean id="lap" class="com.jspring6.Laptop" autowire="byName">
    </bean> 
<!-- Injecting the obj Computer Bean from the Desktopo as concrete class , if you have the differenet name than it will not woek-->
     <bean id="alienif" class="com.jspring6.AlienInterface" autowire="byName">

    <!-- If you prefer to mention the property thsan it will go for property -->
    <property Name= "com" ref ="lap"/>
  <!-- If the lap and lap1 is -->  

  // you can use the bytype , autowire for the one bean objcet or expilicitly mention the name  in the autowire=""

    </bean> 
-->

// Primary Bean 
# if the Spring is not able to decide which bean obj to select for the autowire be can use the 
the Primary Bean = "true"
// It worok only when there is confusion if you have explicitly mention the ref then it will go for the ref 

<bean id="com1" class="com..... primary= "true">
</bean>
 * 
 */