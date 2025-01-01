package com.jspring6;

public class AlienSpring {
    //private int age;
    int age =22;
   // private Laptop lap;  // java.lang.NullPointerException:
    //private Laptop lap = new Laptop(); // to avoid the Exception 
    // use the Injecting the obj , first make the getter setter as it is pvt var
    private Laptop lap;




    // constructor
    public AlienSpring() {
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

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code() {
        System.out.println("AlienSpring coding Now ");
        lap.compile();  
    }

  

}
