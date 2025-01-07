package com.jspring6.springjdbcjp.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private int rollno;
    private String name;
    private int marks;

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
    }

    
}

// clas Name will be the tables 
// and obj will be the columns 