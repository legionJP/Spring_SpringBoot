package com.jspring6.springecomwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspring6.springecomwebapp.model.Product;
import com.jspring6.springecomwebapp.service.ProductService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")   // common mapping for all
@CrossOrigin  // for the other port 
public class ProductController {

    // @GetMapping("/products")
    // public String getProducts()
    // {
    //     return "All products";
    // }

    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts()
    {
        // return productService.getAllProducts();

        // returning the custom http status 
        return  new ResponseEntity<>(productService.getAllProducts(), HttpStatus.ACCEPTED);

    }


 // Controller to return the product by ID  
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id)
    {
        Product product = productService.getProductById(id);
        if(product.getId()>0)
        {
            return new ResponseEntity<>(product, HttpStatus.OK);

        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}

// controller akses to service , and service will talk to repo layer 