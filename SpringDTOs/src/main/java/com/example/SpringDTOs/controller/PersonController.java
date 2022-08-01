package com.example.SpringDTOs.controller;

import com.example.SpringDTOs.model.Person;
import com.example.SpringDTOs.model.PersonDTO;
import com.example.SpringDTOs.service.PersonService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service) {
        super();
        this.service = service;
    }

    @PostMapping("/create")
    public PersonDTO addPerson(@RequestBody Person person) {
        return this.service.addPerson(person);
    }

    @GetMapping("/getAll")
    public List<PersonDTO> getAllPeople() {
        return this.service.getAllPeople();
    }

    @PutMapping("/update")
    public PersonDTO updatePerson(@PathParam("id") Long id, @RequestBody Person person) {
        return this.service.updatePerson(id, person);
    }

    @DeleteMapping("/delete/{id}")
    public boolean removePerson(@PathVariable Long id) {
        return this.service.removePerson(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Hello, World!";
    }
}
