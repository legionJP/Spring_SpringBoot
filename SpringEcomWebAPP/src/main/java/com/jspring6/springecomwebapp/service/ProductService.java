package com.jspring6.springecomwebapp.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

    
    public Product addProduct(Product product, MultipartFile image) throws IOException {
        
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());
        return  productRepo.save(product);  // saving the product 
    }

    public Product updateProduct(Product product, MultipartFile image)  throws IOException{
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());
        return  productRepo.save(product); 
        
    }
    public void deleteProduct(int id) {
        
        productRepo.deleteById(id);
    }
    
    public List<Product> searchProducts(String keyword) {
        
        return productRepo.searchProducts(keyword);
    } 



}
