# Spring Boot MVC Rest API using REACT UI 

- 1.  Common Mapping/ API end point 
### [Product Controller API](src/main/java/com/jspring6/springecomwebapp/controller/ProductController.java)


### 2. Making the DB Model and Connection

- [ DB Product Model](src/main/java/com/jspring6/springecomwebapp/model/Product.java)

- [DB Connection Config](src/main/resources/application.properties)


### 3. Fetching all Products from DB 

- [Product Controller API ](src/main/java/com/jspring6/springecomwebapp/controller/ProductController.java)


- Start the React UI app and allow CORS 

### 4. Response Entity 

- Writing the Response code via Response Entity 
```
- sending the Different Status Code
- 200 - OK (GET)
- 201 - OK Created (Post)
```

```java

    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts()
    {
        // return productService.getAllProducts();

        // returning the custom http status 
        return  new ResponseEntity<>(productService.getAllProducts(), HttpStatus.ACCEPTED);

    }

```

### 5. Fetch product By Id

