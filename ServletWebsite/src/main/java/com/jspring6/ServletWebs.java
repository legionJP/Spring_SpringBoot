package com.jspring6;

import java.io.IOException;
import java.io.PrintWriter;

//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@jakarta.servlet.annotation.WebServlet("/hello")
// @WebServlet("/hello")
public class ServletWebs extends HttpServlet {  // for req and response extend the class

    @Override
  //  protected void service(HttpServletRequest req , HttpServletResponse res) // it get executes whenever the req is send
    public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
    {
        //send the data and receive //req and response , 
        // client data in req object and server data in res object is stored 

        // check the method call
        System.out.println("In Service ");

        res.getWriter().println(" Hello Servlet ");

// or using the Printwriter Class

        PrintWriter out = res.getWriter(); // it writes in the response obj
        // out.println("Hello Tom Cat ");
        out.println("<h1> Hello Tom Cat</h2>");

// sending the response type as text/html
        res.setContentType("text/html");

        out.println("<h1> Hello Tom Cat</h2>");
// Method for the servlet to get the is : doGet , doPost ..

    //public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException

    // here accepting the req , sending the response and the html data as well 
    // instead we can use the MVC 

    }
}

// to show something for the user 

// importing the http serveleting by extending the httpsservlet 

// to execute Servelt service you have to send the request to the servlet 


// Servlet Mapping 

// by using the servlet 
// by using the annotation : @WebServlet : work for the external tomacat 