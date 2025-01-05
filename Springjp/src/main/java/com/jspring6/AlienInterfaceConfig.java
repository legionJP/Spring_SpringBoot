package com.jspring6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

// @Component
// @ComponentScan("com.jspring6")

public class AlienInterfaceConfig {
    
private int age;
// private ConfigDesktop com1;
private Computer com1;
private ConfigDesktop lap;
private Laptop laptoplap;


// constructor
public AlienInterfaceConfig() {
    System.out.println("Alien Interface obj created");
}

public void coding() {
    System.out.println("Alien config Interface coding Now ");
    com1.compile();  
    // lap.compile();
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public Computer getCom() {
    return com1;
}

public void setCom(Computer com12) {
    this.com1 = com12;
}

public ConfigDesktop getLap() {
    return lap;
}

public void setLap(ConfigDesktop lap) {
    this.lap = lap;
}

public Laptop getLaptoplap() {
    return laptoplap;
}

public void setLaptoplap(Laptop laptoplap) {
    this.laptoplap = laptoplap;
}



}
