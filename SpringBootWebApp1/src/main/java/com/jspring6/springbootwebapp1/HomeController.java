package com.jspring6.springbootwebapp1;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

// Accepting the data Servlet
    @RequestMapping("/add")
    public String add(HttpServletRequest req) {
        int num1 = Integer.parseInt(req.getParameter("num1")); // bcz http req return the string
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);
        return "result";

        // Dispatch a servlet map the methods and views
    }
}


/*
// Controller
 // this method is responsible for calling the home.jsp and should return the view technology
 * You can use GetMapping other methods as well
 *
 */