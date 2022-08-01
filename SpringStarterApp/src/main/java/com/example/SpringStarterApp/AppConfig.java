package com.example.SpringStarterApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

@Configuration
public class AppConfig {

    @Bean
    public String getCityName() {
        return "New York";
    }

    @Bean
    public String getFlowerName() {
        return "White Rose";
    }

    @Bean
    public LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    @Bean
    @Scope("prototype")
    public Book getBook() {
        return new Book();
    }

    @Bean
    @Scope("prototype")
    public Computer getComputer() {
        return new Computer();
    }

    @Bean
    @Scope("prototype")
    public Profile getProfile() {
        return new Profile();
    }

}
