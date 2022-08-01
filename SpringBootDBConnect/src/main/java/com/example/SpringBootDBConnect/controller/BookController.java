package com.example.SpringBootDBConnect.controller;

import com.example.SpringBootDBConnect.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RestController
public class BookController {

    public List<Book> list = new ArrayList<>();

    @PostMapping("/create")
    public void create(@RequestBody Book b1) {
        this.list.add(b1);
    }


    @GetMapping("/read")
    public List<Book> read() {

        return this.list;
    }


    @PutMapping("/update/{id}")
    public Book update(@PathVariable int id, @RequestBody Book b2) {
        this.list.remove(id);
        this.list.add(b2);
        return this.list.get(id);
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        this.list.remove(id);
    }


    @GetMapping("/test")
    public String test() {

        return "Testing..";
    }
}
