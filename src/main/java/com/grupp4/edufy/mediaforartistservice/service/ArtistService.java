package com.grupp4.edufy.mediaforartistservice.service;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Artist;

/**
 * Interface ArtistService
 * Created by Marcus Friberg on 2022-10-02.
 */
public interface ArtistService {
    Artist findById(int theId);
}
