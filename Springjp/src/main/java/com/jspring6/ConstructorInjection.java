package com.jspring6;

import java.beans.ConstructorProperties;

public class ConstructorInjection {
    private int age1;
    private Laptop lap;
    // third var
    private int age2;
    
    // default constructor 
    public ConstructorInjection(){
        System.out.println("Object created");
    }

// parametrized Construcotr  for 1 value
    // public ConstructorInjection(int age1){
    //     System.out.println("para constructor called");
    //     this.age1 = age1;
    // }


    // parametrized Construcotr  for 2 value

    //@ConstructorProperties({"age1","lap"})
    public ConstructorInjection(int age1, Laptop lap){
        System.out.println("para constructor called");
        this.age1 = age1;
        this.lap = lap;
    }

    

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code() {
        System.out.println("Constructor Injection ");
        lap.compile();  
    }
}

// Assigning the Value with the help of the construcotr  
// using the Spring bean property  called the Constructor-arg in xml 


// if the consturctor which takes the 2 argument  

// <bean id="constinject" class="com.jspring6.ConstructorInjection">
//     <constructor-arg value="25"/>
//     <constructor-arg ref="lap1" />
//     </bean>

// above to look where the the value of age and obj lap should be pass , 
// it looks for the squence if the the type is not matching it will give the error ]
// Below code will the error : 
//     <constructor-arg ref="lap1" />
//    <constructor-arg value="25"/>

// to slove this mention the type 
    //     <constructor-arg  type="com.jspring6.Laptop" ref="lap1" />
    //     <constructor-arg type="int" ref="lap1" />

// If mentions the type it will look for the type if not it will look for the sequence 

// 1. Note : If we have the the 2 var of int type and constructor take also two int type , then the type mention will not work 
// we have to mention the index number 

 //     <constructor-arg  index="1" ref="lap1" />
    //  <constructor-arg index="0" value="25" />  // this is index of the contructor vars

    //2. Instead of the Index we can use the directly the name but have to follow the sequence

  //        <constructor-arg name="age" value="25"/>
    //     <constructor-arg name="lap" ref="lap1" />

// to slove the problem the sequnce in the name use the @ConstructorPropoerties annotation    

// //@ConstructorProperties({"age1","lap"})
// public ConstructorInjection(int age1, Laptop lap){
//     System.out.println("para constructor called");
//     this.age1 = age1;
//     this.lap = lap;
// }