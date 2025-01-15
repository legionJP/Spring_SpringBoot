package com.jspring6.springecomwebapp.model;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private int id;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private String category;

// changing the date foramt 
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")    
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

// 
    public  Product(int id)
    {
        this.id =id;
    }
    
}
