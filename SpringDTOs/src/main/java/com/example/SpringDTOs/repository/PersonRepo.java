package com.example.SpringDTOs.repository;

import com.example.SpringDTOs.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p WHERE p.name = ?1")
    List<Person> findPersonByName(String name);
}
