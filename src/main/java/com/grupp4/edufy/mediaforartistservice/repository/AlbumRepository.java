package com.grupp4.edufy.mediaforartistservice.repository;
// Imports
import com.grupp4.edufy.mediaforartistservice.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Marcus Friberg on 2022-10-02.
 */
public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
