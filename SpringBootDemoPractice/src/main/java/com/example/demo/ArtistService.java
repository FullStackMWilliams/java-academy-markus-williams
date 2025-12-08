package com.example.demo;

import org.springframework.stereotype.Service;


@Service
 class ArtistService {
    public Artist getFavoriteArtist() {
       return new Artist("50 cent","Get rich or die trying", "Many Men");
    }
}