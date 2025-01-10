package com.jspring6.springbootwebapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller   // Stereotype annotation , this gets transformed into the servlet by tomcat
public class HomeController {
    
// Controller
    // this method is responsible for calling the home.jsp and should return the view technology


    // @RequestMapping("/home") //give the path for root /
    @GetMapping("/home")
    public String home(){
        System.out.println(" Home Method Called ");
        return "index";
    }
}

// Other Methods 
/*
 * GetMapping 
 * 
 * 
 */