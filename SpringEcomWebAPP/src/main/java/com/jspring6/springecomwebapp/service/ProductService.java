package com.jspring6.springecomwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspring6.springecomwebapp.model.Product;
import com.jspring6.springecomwebapp.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public  List<Product> getAllProducts()
    {
        return productRepo.findAll();
    }
// service Method to return the product by id 
    public Product getProductById(int id) {
        
        // return productRepo.findById(id).get();    // or can use the or.Else return empty 
        return productRepo.findById(id).orElse(new Product(-1));    // or can use the or.Else return empty 

    } 



}
