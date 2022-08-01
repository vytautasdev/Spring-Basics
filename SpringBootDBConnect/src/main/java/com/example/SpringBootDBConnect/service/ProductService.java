package com.example.SpringBootDBConnect.service;

import com.example.SpringBootDBConnect.entity.Product;
import com.example.SpringBootDBConnect.exception.ProductNotFoundException;
import com.example.SpringBootDBConnect.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product addProduct(Product p) {
        return productRepository.save(p);
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    public Product updateProduct(int id, Product p) {
        var tempProduct = productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
        var product = Optional.of(tempProduct);
        var existing = product.get();
        existing.setId(p.getId());
        existing.setBrand(p.getBrand());
        existing.setName(p.getName());

        return productRepository.save(existing);

    }

    public boolean deleteProduct(int id) {
        productRepository.deleteById(id);
        var exists = productRepository.existsById(id);
        return !exists;
    }

    public List<Product> getProductByBrand(String brand) {
        return productRepository.findProductByBrand(brand);
    }

    public List<Product> getProductByName(String name) {
        return productRepository.findProductByName(name);
    }


}
