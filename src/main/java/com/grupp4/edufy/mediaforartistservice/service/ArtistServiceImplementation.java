package com.grupp4.edufy.mediaforartistservice.service;

import com.grupp4.edufy.mediaforartistservice.model.Artist;
import com.grupp4.edufy.mediaforartistservice.repository.AlbumRepository;
import com.grupp4.edufy.mediaforartistservice.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Class ArtistServiceImplementation, an implementation of the ArtistService interface
 * Created by Marcus Friberg on 2022-10-02.
 */
@Service
public class ArtistServiceImplementation implements ArtistService {
    // Properties
    private final ArtistRepository artistRepository;

    // Autowired constructor with constructor injection of the repository for Artist
    @Autowired
    public ArtistServiceImplementation(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Artist findById(int theId) {
        // The provided id may not be found and the call return null, hence the Optional.
        Optional<Artist> result = artistRepository.findById(theId);
        Artist theArtist;
        if(result.isPresent()) {
            theArtist = result.get();
        } else {
            throw new RuntimeException("Could not fetch an artist with the id: " + theId);
        }
        return theArtist;
    }
}
