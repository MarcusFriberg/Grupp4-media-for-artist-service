package com.grupp4.edufy.mediaforartistservice.repository;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Marcus Friberg on 2022-10-02.
 */
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
}
