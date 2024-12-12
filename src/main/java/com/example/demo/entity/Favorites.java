package com.example.demo.entity;

import java.util.Date;

public class Favorites {
    private Long id;
    private Long userId;
    private Long movieId;
    private String title;
    private String note;
    private Date favorites_date;

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getFavorites_date() {
        return favorites_date;
    }

    public void setFavorites_date(Date favorites_date) {
        this.favorites_date = favorites_date;
    }
}
