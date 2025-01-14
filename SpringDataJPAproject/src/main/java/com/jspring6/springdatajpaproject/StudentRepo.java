package com.jspring6.springdatajpaproject;

import com.jspring6.springdatajpaproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends JpaRepository<Student, Integer>
    {


    }

