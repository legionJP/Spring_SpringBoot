package com.springboot.sf6sb3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.springboot.sf6sb3.Laptop;
import com.springboot.sf6sb3.model.Laptop1;

@Service      // Service and Component do the same 
public class LaptopService {

    @Autowired
    private LaotopRepository repo;


    public void addLaptop(Laptop1 lap)
    {
        // getting the Laptop1 obj 
        repo.save(lap);
        System.out.println("Method Called ");
    }

        public boolean isGoodForProgram(Laptop1 lap)
        {
            return true;
        }
}
