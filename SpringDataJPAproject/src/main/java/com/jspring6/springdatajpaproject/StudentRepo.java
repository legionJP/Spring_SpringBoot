package com.jspring6.springdatajpaproject;

import com.jspring6.springdatajpaproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo  extends JpaRepository<Student, Integer>
    {

        // new method by using the query annotation
      // using the class name and property nam in JPA
        @Query("select s from Student s where s.name= ?1")  // ? is for the 1st parameter
        List<Student> findByStudentName(String name);

        //   //DSL Query ,  By default the JPA will implement the query for below things like :
        List<Student> findByName(String name);
        List<Student> findByMarks(int marks);
        List<Student> findByMarksGreaterThan(int marks);
        List<Student> findByNameAndMarks(String name, int marks);
    }

