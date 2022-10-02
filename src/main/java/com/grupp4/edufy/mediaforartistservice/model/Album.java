package com.grupp4.edufy.mediaforartistservice.model;
// Imports
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

/**
 * Class Album, entity for albums
 * Created by Marcus Friberg on 2022-10-02.
 */
@Entity
@Table(name = "album")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Album {
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String albumName;
    private LocalDate releaseDate;

    // Setters & Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
