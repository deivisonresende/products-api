package com.example.productsApi.controller;

import com.example.productsApi.model.Product;
import com.example.productsApi.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping()
    public void create(@RequestBody Product product) {
        System.out.println("product received " + product.toString());
    }
}
