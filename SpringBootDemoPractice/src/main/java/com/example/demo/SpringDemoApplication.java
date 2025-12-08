package com.example.demo;

//hello we might have a success

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;



@SpringBootApplication

@RestController

public class SpringDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringDemoApplication.class, args);

    }

    @GetMapping("/")

    public String hello() {

        return "Hello Spring Boot!";

    }

    @GetMapping("/FavoriteArtist")

    public String Artist() {
        return "50 cent";
    }

    private final ArtistService service;

    public SpringDemoApplication(ArtistService service) {
        this.service = service;
    }

    @GetMapping("/artist")
    public Artist getFavoriteArtist(){
        return service.getFavoriteArtist();    }
}