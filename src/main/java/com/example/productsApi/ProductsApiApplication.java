package com.example.productsApi;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApiApplication {

    @PostConstruct
    public void init() {
        System.out.println("Server was initialized");
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductsApiApplication.class, args);
    }

}
