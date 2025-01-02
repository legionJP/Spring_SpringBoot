package com.jspring6;

public class AlienInterface {


    private int age;
    private Computer com;
    private Laptop lap;

    // constructor
    public AlienInterface() {
        System.out.println("AlienSpring obj created");
    }

    // getter and seeter for the setter injection 
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter is called");
        this.age = age;
    }

    public Computer getLap() {
        return com;
    }

    public void setLap(Computer com) {
        this.com = com;
    }

    public void coding() {
        System.out.println("AlienSpring coding Now ");
        com.compile();  
        lap.compile();
    }

  

}
