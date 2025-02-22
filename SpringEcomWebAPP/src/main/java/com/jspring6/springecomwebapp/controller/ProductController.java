package com.jspring6.springecomwebapp.controller;

import java.io.IOException;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jspring6.springecomwebapp.model.Product;
import com.jspring6.springecomwebapp.service.ProductService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



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

// Image Controller , 

    @PostMapping("/product")
    public ResponseEntity<?>  addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile)
   {
        Product saveProduct = null;
        try {
            saveProduct = productService.addProduct(product, imageFile);
            return new ResponseEntity<>(saveProduct, HttpStatus.CREATED);

        } catch (IOException e) {
            // throw new RuntimeException(e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
// Image Fetching Controller 

    @GetMapping("product/{productId}/image")
    public ResponseEntity<byte []> getImageByProductId(@PathVariable int productId)
    {
        Product product = productService.getProductById(productId);

        if(product.getId()>0)
            return new ResponseEntity<>(product.getImageData(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);    

    }

// Update and delete controller

    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestPart Product product, @RequestPart MultipartFile imageFile)
    {
        Product updatedProduct = null;
        try{
            updatedProduct = productService.updateProduct(product, imageFile);
            return new ResponseEntity<>("updated",HttpStatus.OK);

        }
        catch(IOException e)
        {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    
    // You can use the productservice.addOrUpdateProduct so you don't have to need to create the 2 methods in the service 


// Delete Controller 
    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id)
    {
        Product product = productService.getProductById(id);
        if(product != null){
            productService.deleteProduct(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


// Search Controller 

    @GetMapping("/product/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword) {

        List<Product> products= productService.searchProducts(keyword);
        System.out.println("searching with " +keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    


}

// controller akses to service , and service will talk to repo layer 