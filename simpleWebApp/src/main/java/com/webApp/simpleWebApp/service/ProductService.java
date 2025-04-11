package com.webApp.simpleWebApp.service;


import com.webApp.simpleWebApp.model.Product;
import com.webApp.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;


    public List<Product> getProducts() {

        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
//        return
//        products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(100,"No Item",0));
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {

      repo.deleteById(prodId);
    }
}
