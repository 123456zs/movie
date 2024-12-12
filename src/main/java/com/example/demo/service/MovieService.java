package com.example.demo.service;

import com.example.demo.entity.Movie;

import java.util.List;

public interface MovieService {

    Movie getMovieById(Long id);

    void addMovie(Movie movie);

    void updateMovie(Movie movie);

    void deleteMovie(Long id);

    List<Movie> getAllMovies();
}
