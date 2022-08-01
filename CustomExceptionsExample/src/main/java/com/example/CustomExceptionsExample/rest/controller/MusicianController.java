package com.example.CustomExceptionsExample.rest.controller;

import com.example.CustomExceptionsExample.persistence.domain.Band;
import com.example.CustomExceptionsExample.persistence.domain.Musician;
import com.example.CustomExceptionsExample.persistence.repository.MusicianRepository;
import com.example.CustomExceptionsExample.rest.dto.BandDTO;
import com.example.CustomExceptionsExample.rest.dto.MusicianDTO;
import com.example.CustomExceptionsExample.service.BandService;
import com.example.CustomExceptionsExample.service.MusicianService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicianController {

    private MusicianService musicianService;

    private MusicianRepository musicianRepository;

    public MusicianController(MusicianService musicianService, MusicianRepository musicianRepository) {
        this.musicianService = musicianService;
        this.musicianRepository = musicianRepository;
    }

    @PostMapping("/createMusician")
    public Musician addMusician(@RequestBody Musician musician) {
        return musicianService.addMusician(musician);
    }

    @GetMapping("/readMusician")
    public List<Musician> readAll() {
        return musicianService.getAllMusicians();
    }

    @GetMapping("/readMusician/{name}")
    public List<Musician> readByName(@PathVariable String name) {
        return musicianRepository.getMusicianByName(name);
    }

    @PutMapping("/updateMusician/{id}")
    public Musician update(@PathVariable Long id, @RequestBody Musician musician) {
        return musicianService.updateMusician(id, musician);
    }

    @DeleteMapping("/deleteMusician/{id}")
    public void delete(@PathVariable Long id) {
        musicianService.removeMusician(id);
    }


}
