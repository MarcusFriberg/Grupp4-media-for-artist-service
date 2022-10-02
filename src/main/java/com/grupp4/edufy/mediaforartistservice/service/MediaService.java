package com.grupp4.edufy.mediaforartistservice.service;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Artist;
import com.grupp4.edufy.mediaforartistservice.model.Media;
import java.util.List;

/**
 * Interface MediaService
 * Created by Marcus Friberg on 2022-10-02.
 */
public interface MediaService {
    List<Media> findAllMediaForArtist(Artist theArtist);
}
