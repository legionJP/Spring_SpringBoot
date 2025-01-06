package com.springboot.sf6sb3.service;

import org.springframework.stereotype.Repository;

import com.springboot.sf6sb3.model.Laptop1;

@Repository  // same as component
public class LaotopRepository {
    public void save(Laptop1 lap){

        System.out.println("Saved in the Database");
    }
}

// This is the class where we have to write the all the JDBC operatiopns 
// this is class responsible to connect with db and all the crud opeations 

// create the obj of the class in LaptopService class and save the obj of the class
