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
