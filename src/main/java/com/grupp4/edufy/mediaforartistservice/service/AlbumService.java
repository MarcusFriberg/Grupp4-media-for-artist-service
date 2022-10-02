package com.grupp4.edufy.mediaforartistservice.service;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Album;

/**
 * Interface AlbumService
 * Created by Marcus Friberg on 2022-10-02.
 */
public interface AlbumService {
    Album findById(int theId);
}
