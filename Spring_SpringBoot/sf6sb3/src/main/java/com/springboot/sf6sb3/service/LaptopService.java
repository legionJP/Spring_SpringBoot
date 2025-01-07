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


// main class



        
// // When the DISpring is dependent on the other class object : like model 

//         // Laptop lap = context.getBean(Laptop.class);
//         // lap.compile();   // we are able to use the complie in main bcz we have the container access using the bean

//         LaptopService service = context.getBean(LaptopService.class);
//         Laptop1 lap = context.getBean(Laptop1.class);

//         // saving the data using the service 
//         service.addLaptop(lap);

//         // if we want to store the JDBC in the database need to create in the database


        