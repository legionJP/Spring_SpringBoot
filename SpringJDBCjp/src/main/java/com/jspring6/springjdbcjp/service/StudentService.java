package com.jspring6.springjdbcjp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jspring6.springjdbcjp.model.Student;
import com.jspring6.springjdbcjp.repo.StudentRepo;

@Service
public class StudentService {

    // to put the addStudent Method in the repo 
    @Autowired
    private StudentRepo repo;

    
    public void addStudent(Student s) {
        
        System.out.println("Data will be Added ");
        repo.save(s);      // saving the data using the repo layer 
    }

// Gtters , Setters 
    public StudentRepo getRepo() {
        return repo;
    }

    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

// get Students 

    public List<Student> getStudents() {
        return repo.findAll();   // for JPA Convience 
    }
}
