package com.jspring6;

//import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@jakarta.servlet.annotation.WebServlet
// @WebServlet("/hello")
public class ServletWebs extends HttpServlet {  // for req and response extend the class

    @Override
    protected void service(HttpServletRequest req , HttpServletResponse res) // it get executes whenever the req is send
    {
        //send the data and receive //req and response , 
        // client data in req object and server data in res object is stored 

        // check the method call
        System.out.println("In Service ");


        // mapping for the url and Servlet 

    }
}

// to show something for the user 

// importing the http serveleting by extending the httpsservlet 

// to execute Servelt service you have to send the request to the servlet 


// Servlet Mapping 

// by using the servlet 
// by using the annotation : @WebServlet : work for the external tomacat 