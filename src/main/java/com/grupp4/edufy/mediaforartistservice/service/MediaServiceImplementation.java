package com.grupp4.edufy.mediaforartistservice.service;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Artist;
import com.grupp4.edufy.mediaforartistservice.model.Media;
import com.grupp4.edufy.mediaforartistservice.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Class MediaServiceImplementation, an implementation of the MediaService interface
 * Created by Marcus Friberg on 2022-10-02.
 */
@Service
public class MediaServiceImplementation implements MediaService {
    // Properties
    private final MediaRepository mediaRepository;

    // Autowired constructor with constructor injection of the repository for Media
    @Autowired
    public MediaServiceImplementation(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    @Override
    public List<Media> findAllMediaForArtist(Artist theArtist) {
        return mediaRepository.findByArtistOrderByReleaseDateDesc(theArtist);
    }
}
