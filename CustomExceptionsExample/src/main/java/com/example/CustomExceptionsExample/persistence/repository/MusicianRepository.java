package com.example.CustomExceptionsExample.persistence.repository;

import com.example.CustomExceptionsExample.persistence.domain.Musician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface MusicianRepository extends JpaRepository<Musician, Long> {

    @Query("SELECT m FROM Musician m WHERE m.name = ?1")
    List<Musician> getMusicianByName(String name);

}
