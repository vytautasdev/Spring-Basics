package com.vytautasdev.demoApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String greet() {
        return "Hello World!";
    }

    @Bean
    public String showMovieName() {
        return "Interstellar";
    }
}
