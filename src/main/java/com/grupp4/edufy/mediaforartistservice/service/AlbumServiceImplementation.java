package com.grupp4.edufy.mediaforartistservice.service;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Album;
import com.grupp4.edufy.mediaforartistservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 * Class AlbumServiceImplementation, an implementation of the AlbumService interface
 * Created by Marcus Friberg on 2022-10-02.
 */
@Service
public class AlbumServiceImplementation implements AlbumService {
    // Properties
    private final AlbumRepository albumRepository;

    // Autowired constructor with constructor injection of the repository for Album
    @Autowired
    public AlbumServiceImplementation(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public Album findById(int theId) {
        // The provided id may not be found and the call return null, hence the Optional.
        Optional<Album> result = albumRepository.findById(theId);
        Album theAlbum;
        if(result.isPresent()) {
            theAlbum = result.get();
        } else {
            throw new RuntimeException("Could not fetch an album with the id: " + theId);
        }
        return theAlbum;
    }
}
