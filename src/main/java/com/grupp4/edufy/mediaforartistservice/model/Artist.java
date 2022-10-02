package com.grupp4.edufy.mediaforartistservice.model;
// Imports
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * Class Artist, entity for artists
 * Created by Marcus Friberg on 2022-10-02.
 */
@Entity
@Table(name = "artist")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Artist {
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String artistName;

    // Setters & Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
