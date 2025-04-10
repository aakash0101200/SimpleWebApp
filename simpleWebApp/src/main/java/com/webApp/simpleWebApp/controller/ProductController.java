package com.webApp.simpleWebApp.controller;

import com.webApp.simpleWebApp.model.Product;
import com.webApp.simpleWebApp.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {

        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) { //this used to bind request body data to Java objects

        service.addProduct(prod);

    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println("I am here to find error");
        service.updateProduct(prod);
    }
    /*Main Steps for Implementing PUT Requests:

    Retrieve existing data using GET.

    Accept updated data via a method annotated with @RequestBody.

    Identify the target product by its ID.

    Update the product details in the service layer.

    Use PUT as the HTTP method to ensure the server handles the request properly.*/

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
       service.deleteProduct(prodId);
    }
}