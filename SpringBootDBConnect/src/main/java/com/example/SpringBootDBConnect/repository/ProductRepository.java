package com.example.SpringBootDBConnect.repository;

import com.example.SpringBootDBConnect.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT * FROM Product WHERE brand=?1", nativeQuery = true)
    List<Product> findProductByBrand(String brand);

    @Query("SELECT p FROM Product p WHERE p.name = ?1")
    List<Product> findProductByName(String name);

}
