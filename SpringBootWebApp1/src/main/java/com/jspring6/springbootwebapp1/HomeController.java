package com.jspring6.springbootwebapp1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
// Stereotype annotation , this gets transformed into the servlet by tomcat
public class HomeController {

    // @RequestMapping("/home") //give the path for root /
    @GetMapping("/home")
    public String home(){
        System.out.println(" Home Method Called ");
        return "index";
    }

// Another Controller
//    @RequestMapping("/add")
//    public String add()
//    {
//        System.out.println(" Add Method Called ");
//        return "result";
//        // Dispatch a servlet map the methods and views
//    }

// Accepting the data Servlet and Using the Http session
//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        int num1 = Integer.parseInt(req.getParameter("num1")); // bcz http servlet req. return the string
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        System.out.println(result);
//
//        // session
//        session.setAttribute("result", result); // name result.jsp and data result value , added in sessin object
//        return "result";
//        // Dispatch servlet map the methods and views like return the result.jsp

// Using the Spring way of Request Param :

    @RequestMapping("/add")
    //public String add(int num1, int num2, HttpSession session) {

    // requesting the actual var in the num and num2 using the RequestParam
    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2, HttpSession session) {
//        int result = num1 + num2 +2;
          int result = num + num2;
        // session
        session.setAttribute("result", result);
        return "result";
    }
}


/*
// Controller
 // this method is responsible for calling the home.jsp and should return the view technology
 * You can use GetMapping other methods as well
 *
 */