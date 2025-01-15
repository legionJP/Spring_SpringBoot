package com.jspring6.springecomwebapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspring6.springecomwebapp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    

}
