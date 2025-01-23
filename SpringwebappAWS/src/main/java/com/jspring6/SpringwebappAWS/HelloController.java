package com.jspring6.SpringwebappAWS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String greet()
    {
        return "Welcome to O-Auth2";
    }

    @GetMapping("/info")
    public String autoMachine()
    {
        String os = System.getProperty(("os.name"));
        String version = System.getProperty("os.version");
        String architecture = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String user = System.getProperty("user.name");
        return "OS: " + os + "Vesrion: " + version + "Architecture: " + architecture + "Java Version: " + javaVersion + "User: " + user;



    }

}
