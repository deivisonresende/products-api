package com.example.productsApi.controller;

import com.example.productsApi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping()
    public void create(@RequestBody Product product) {
        System.out.println("product received " + product.toString());
    }
}
