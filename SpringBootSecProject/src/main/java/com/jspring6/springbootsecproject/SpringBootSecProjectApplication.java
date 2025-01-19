package com.jspring6.springbootsecproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jspring6.springbootsecproject"})
public class SpringBootSecProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecProjectApplication.class, args);
    }

}
