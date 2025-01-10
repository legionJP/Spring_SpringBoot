package com.jspring6;

public class RessponseClient {
    public void clientResponse()
    {
        System.out.println("Responding to the client ");
    }
}

/*
 * 
 *      System.out.println("In Service ");

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

 * 
 */