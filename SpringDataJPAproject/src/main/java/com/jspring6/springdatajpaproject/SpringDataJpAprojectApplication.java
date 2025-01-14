package com.jspring6.springdatajpaproject;

import com.jspring6.springdatajpaproject.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpAprojectApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(SpringDataJpAprojectApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

//        s1.setRollno(101);
//        s1.setName("John");
//        s1.setMarks(32);
//
//        s2.setRollno(102);
//        s2.setName("Jane");
//        s2.setMarks(33);
//
//        s3.setRollno(103);
//        s3.setName("John");
//        s3.setMarks(34);
//
//        repo.save(s2);
//        repo.save(s3);

// findall
        System.out.println(repo.findAll());

// find By ID
        System.out.println(repo.findById(101));

        // Student sfind = repo.findById(104);  // give the error of null pointer
       // Optional<Student> sfind = repo.findById(104);
        Optional<Student> sfind = repo.findById(103);
        System.out.println(sfind.orElse(new Student())); // get the other new obj if no data

//search By Name
        // using the @Query annotation
        System.out.println(repo.findByStudentName("John"));
        // using the DSL query
        System.out.println(repo.findByStudentName("Jane"));
        System.out.println(repo.findByMarksGreaterThan(30));
        System.out.println(repo.findByMarks(23));

// Update and Delete

        s3.setRollno(103);
        s3.setName("JP");
        s3.setMarks(99);
        repo.save(s3);

        repo.delete(s3);
    }
}

/*

A container object which may or may not contain a non-null value.
If a value is present, isPresent() returns true. If no value is present,
 the object is considered empty and isPresent() returns false.
 */