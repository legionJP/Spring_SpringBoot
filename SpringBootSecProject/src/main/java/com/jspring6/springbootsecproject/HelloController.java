package com.jspring6.springbootsecproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greeting(HttpServletRequest request) {
        return "Hello World" +request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request)
    {
        return "About Page " + request.getSession().getId();
    }
}

