package com.example.CustomExceptionsExample.service;

import com.example.CustomExceptionsExample.exception.MusicianNotFoundException;
import com.example.CustomExceptionsExample.persistence.domain.Musician;
import com.example.CustomExceptionsExample.persistence.repository.MusicianRepository;
import com.example.CustomExceptionsExample.rest.dto.MusicianDTO;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MusicianService {

    private MusicianRepository musicianRepository;
    private ModelMapper mapper;

    public MusicianService(MusicianRepository musicianRepository, ModelMapper mapper) {
        this.musicianRepository = musicianRepository;
        this.mapper = mapper;
    }

//    private Musician mapToDTO(Musician musician) {
//        return mapper.map(musician, Musician.class);
//    }

    public Musician addMusician(Musician musician) {
        return musicianRepository.save(musician);
    }

    public List<Musician> getAllMusicians() {
        return musicianRepository.findAll();
    }



    public Musician getMusicianByName(Long id) {
        return musicianRepository.findById(id).orElseThrow(MusicianNotFoundException::new);
    }

    public Musician updateMusician(Long id, Musician newMusician) {
        var existingOptional = musicianRepository.findById(id);
        var existing = existingOptional.get();

        existing.setId(newMusician.getId());
        existing.setName(newMusician.getName());
        existing.setStrings(newMusician.getStrings());
        existing.setType(newMusician.getType());
        existing.setBand(newMusician.getBand());

        return musicianRepository.save(existing);
    }

    public boolean removeMusician(Long id) {
        musicianRepository.deleteById(id);
        var exists = musicianRepository.existsById(id);
        return !exists;
    }
}
