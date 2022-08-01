package com.example.SpringBootDBConnect.controller;

import com.example.SpringBootDBConnect.entity.Product;
import com.example.SpringBootDBConnect.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public Product create(@RequestBody Product product) {
        return productService.addProduct(product);
    }


    @GetMapping("/read")
    public List<Product> readAll() {
        return productService.getProduct();
    }

    @PutMapping("/update/{id}")
    public Product update(@PathVariable int id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/readByBrand/{brand}")
    public List<Product> readByBrand(@PathVariable String brand) {
        return productService.getProductByBrand(brand);
    }


    @GetMapping("/readByName/{name}")
    public List<Product> readByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }
}
