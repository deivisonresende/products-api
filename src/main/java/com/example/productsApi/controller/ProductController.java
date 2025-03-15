package com.example.productsApi.controller;

import com.example.productsApi.model.Product;
import com.example.productsApi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping()
    public Product create(@RequestBody Product product) {
        String id = UUID.randomUUID().toString();

        product.setId(id);

        productRepository.save(product);

        return product;
    }

    @GetMapping("{id}")
    public Product retrieveById(@PathVariable("id") String id) {
        return this.productRepository.findById(id).orElse(null);
    }

    @GetMapping()
    public List<Product> retrieveByName(@RequestParam("name") String name) {
        return this.productRepository.findByName(name);
    }

    @PutMapping("{id}")
    public void updateById(@PathVariable("id") String id, @RequestBody Product product) {
        product.setId(id);
        productRepository.save(product);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") String id) {
        this.productRepository.deleteById(id);
    }
}
