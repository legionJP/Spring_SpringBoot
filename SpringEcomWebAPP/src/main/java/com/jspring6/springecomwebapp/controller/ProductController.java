package com.jspring6.springecomwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")   // common mapping for all
public class ProductController {

    @GetMapping("/products")
    public String getProducts()
    {
        return "All products";
    }
}
