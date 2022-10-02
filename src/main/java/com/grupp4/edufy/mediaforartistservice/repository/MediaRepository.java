package com.grupp4.edufy.mediaforartistservice.repository;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Artist;
import com.grupp4.edufy.mediaforartistservice.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Created by Marcus Friberg on 2022-10-02.
 */
public interface MediaRepository extends JpaRepository<Media, Integer> {
    // Returns a list of media for the given artist
    List<Media> findByArtistOrderByReleaseDateDesc(Artist theArtist);
}
