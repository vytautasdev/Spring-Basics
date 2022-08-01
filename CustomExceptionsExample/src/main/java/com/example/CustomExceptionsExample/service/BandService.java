package com.example.CustomExceptionsExample.service;

import com.example.CustomExceptionsExample.exception.BandNotFoundException;
import com.example.CustomExceptionsExample.persistence.domain.Band;
import com.example.CustomExceptionsExample.persistence.repository.BandRepository;
import com.example.CustomExceptionsExample.rest.dto.BandDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BandService {

    private BandRepository bandRepository;
    private ModelMapper mapper;


    public BandService(BandRepository bandRepository, ModelMapper mapper) {
        this.bandRepository = bandRepository;
        this.mapper = mapper;
    }

    public Band addBand(Band band) {
        return bandRepository.save(band);
    }

    public List<Band> getAllBands() {
        return bandRepository.findAll();
    }

    public Band getBandById(Long id) {
        return bandRepository.findById(id).orElseThrow(BandNotFoundException::new);
    }

    public Band updateBand(Long id, Band newBand) {
        var existingOptional = bandRepository.findById(id);
        var existing = existingOptional.get();

        existing.setId(newBand.getId());
        existing.setName(newBand.getName());
        existing.setMusicians(newBand.getMusicians());

        return bandRepository.save(existing);

    }

    public boolean deleteBand(Long id) {
        bandRepository.deleteById(id);
        var exists = bandRepository.existsById(id);
        return !exists;
    }


}
