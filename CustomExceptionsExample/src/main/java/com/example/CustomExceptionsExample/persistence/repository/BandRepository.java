package com.example.CustomExceptionsExample.persistence.repository;

import com.example.CustomExceptionsExample.persistence.domain.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface BandRepository extends JpaRepository<Band, Long> {

}
