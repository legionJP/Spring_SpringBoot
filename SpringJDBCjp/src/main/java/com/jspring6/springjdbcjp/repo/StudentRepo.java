package com.jspring6.springjdbcjp.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jspring6.springjdbcjp.model.Student;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("Added.. ");
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        return students;
    
}
}