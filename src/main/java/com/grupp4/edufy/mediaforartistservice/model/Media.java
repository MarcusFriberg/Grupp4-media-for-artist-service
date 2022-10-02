package com.grupp4.edufy.mediaforartistservice.model;
// Imports
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Class Media, entity for media
 * Created by Marcus Friberg on 2022-10-02.
 */
@Entity
@Table(name = "media")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Media {
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private LocalDate releaseDate;
    @JoinColumn(name = "Id")
    @ManyToOne
    private Album album;
    @ManyToMany
    @JoinTable(
            name = "mediaArtist",
            joinColumns = @JoinColumn(name = "artistId", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "mediaId", referencedColumnName = "Id")
    )
    private List<Artist> artist;
    private int mediaTypeId;

    // Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Artist> getArtist() {
        return artist;
    }

    public void setArtist(List<Artist> artist) {
        this.artist = artist;
    }

    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }
}
