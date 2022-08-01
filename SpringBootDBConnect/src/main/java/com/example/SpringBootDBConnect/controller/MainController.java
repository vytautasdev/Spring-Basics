package com.example.SpringBootDBConnect.controller;

import com.example.SpringBootDBConnect.entity.Product;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

//@RestController
//public class MainController {
//
//    public List<Product> list = new ArrayList<>();
//
//    @PostMapping("/create")
//    public boolean create(@RequestBody Product product) {
//        return this.list.add(product);
//    }
//
//    @GetMapping("/home")
//    public String home() {
//        return "My home is in UK";
//    }
//
//    @PutMapping("/update/{id}")
//    public Product update(@PathParam("id") int id, Product product) {
//        this.list.remove(id);
//        this.list.add(id, product);
//        return this.list.get(id);
//    }
//
//    @GetMapping("/products")
//    public List<Product> getList() {
//        return this.list;
//    }
//
//
//}
