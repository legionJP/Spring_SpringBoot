package com.jspring6.OAuth2Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String greet()
    {
        return "Welcome to O-Auth2";
    }

    // @GetMapping("/login")
    // public String login()
    // {
    //     return "login";
    // }
}
