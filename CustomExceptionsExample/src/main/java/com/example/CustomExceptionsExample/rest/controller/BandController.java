package com.example.CustomExceptionsExample.rest.controller;

import com.example.CustomExceptionsExample.persistence.domain.Band;
import com.example.CustomExceptionsExample.rest.dto.BandDTO;
import com.example.CustomExceptionsExample.rest.dto.MusicianDTO;
import com.example.CustomExceptionsExample.service.BandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BandController {

    private BandService bandService;

    public BandController(BandService bandService) {
        this.bandService = bandService;
    }

//    private MusicianDTO mapToDTO(Musician musician) {
//        return mapper.map(musician, Musician.class);
//    }

    @PostMapping("/createBand")
    public Band addBand(@RequestBody Band band) {
        return bandService.addBand(band);
    }

    @GetMapping("/readBand")
    public List<Band> readAll() {
        return bandService.getAllBands();
    }

    @GetMapping("/readBand/{id}")
    public Band readById(@PathVariable Long id) {
        return bandService.getBandById(id);
    }

    @PutMapping("/updateBand/{id}")
    public Band update(@PathVariable Long id, @RequestBody Band band) {
        return bandService.updateBand(id, band);
    }

    @DeleteMapping("/deleteBand/{id}")
    public void delete(@PathVariable Long id) {
        bandService.deleteBand(id);
    }

}
