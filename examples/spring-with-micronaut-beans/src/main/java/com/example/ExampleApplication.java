package com.example;

import io.micronaut.spring.beans.MicronautBeanProcessor;

import jakarta.inject.Singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Bean
    public MicronautBeanProcessor micronautBeanProcessor() {
        return new MicronautBeanProcessor(Singleton.class);
    }

}
