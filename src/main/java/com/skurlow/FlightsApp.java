package com.skurlow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Class Application.
 */
@SpringBootApplication
public class FlightsApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlightsApp.class);

    public static void main(String[] args) {
        SpringApplication.run(FlightsApp.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> LOGGER.info("Flights application started.");
    }
}
