package com.jspring6.springdatajpaproject;

import com.jspring6.springdatajpaproject.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpAprojectApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(SpringDataJpAprojectApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setRollno(101);
        s1.setName("John");
        s1.setMarks(32);

        s2.setRollno(102);
        s2.setName("Jane");
        s2.setMarks(33);

        s3.setRollno(103);
        s3.setName("John");
        s3.setMarks(34);

        repo.save(s1);

    }


}
