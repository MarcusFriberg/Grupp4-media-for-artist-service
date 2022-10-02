package com.grupp4.edufy.mediaforartistservice.controller;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Artist;
import com.grupp4.edufy.mediaforartistservice.model.Media;
import com.grupp4.edufy.mediaforartistservice.service.AlbumService;
import com.grupp4.edufy.mediaforartistservice.service.ArtistService;
import com.grupp4.edufy.mediaforartistservice.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Class MediaController, a RestController for the Media entity
 * Created by Marcus Friberg on 2022-10-02.
 */
@RestController
@RequestMapping("/api/v1/")
public class MediaController {
    // Properties
    private final MediaService mediaService;
    private final AlbumService albumService;
    private final ArtistService artistService;

    // Constructor with dependency injection to expose the services
    @Autowired
    public MediaController(MediaService mediaService,
                           AlbumService albumService,
                           ArtistService artistService) {
        super();
        this.mediaService = mediaService;
        this.albumService = albumService;
        this.artistService = artistService;
    }

    @GetMapping("/media")
    public List<Media> getMediaForArtist(@RequestBody Artist theArtist) {
        List<Media> allMediaForArtist = mediaService.findAllMediaForArtist(theArtist);
        return allMediaForArtist;
    }
}
