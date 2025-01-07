package com.jspring6.springjdbcjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jspring6.springjdbcjp.model.Student;

@SpringBootApplication
public class SpringJdbCjpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbCjpApplication.class, args);

        System.out.println("Hello Spring  JDBC ");


// Context 
        ApplicationContext context = SpringApplication.run(SpringJdbCjpApplication.class, args);

// set the values for the Students 
        Student s = context.getBean(Student.class);
        s.setRollno(01);
        s.setName("JP");
        s.setMarks(9);

        addStudent(s);

// Using the H2 Database

         
    }

}



/*
 * 
 * 

- JDBC Template -- It helps the JDBC to connect with DB

        2. Fire Queries
        3. Process Data
        4. Get Output

    ### Every time when want to connect with database or do the db operation we have to send the connection req and every time new connection is created 

    #### So we can use the Data Source and Spring will give those libraries     

    
 * 
 * 
 */