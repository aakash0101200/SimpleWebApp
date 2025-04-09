package com.webApp.simpleWebApp;

import com.sky.simpleWebApp.model.Product;
import com.sky.simpleWebApp.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @Validated
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) { //this used to bind request body data to Java objects
        service.addProduct(prod);
    }
}