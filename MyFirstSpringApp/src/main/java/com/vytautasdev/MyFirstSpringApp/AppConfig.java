package com.vytautasdev.MyFirstSpringApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class AppConfig {

    @Bean
    public String displayCityName() {
        return "New York";
    }

    @Bean
    public String displayFlowerName() {
        return "White Rose";
    }

    @Bean
    public LocalTime displayCurrentTime() {
        return LocalTime.now();
    }

}
