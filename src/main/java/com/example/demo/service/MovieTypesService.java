package com.example.demo.service;

import com.example.demo.entity.Movie_types;

import java.util.List;

public interface MovieTypesService {

    Movie_types getMovieTypesById(Long id);

    void addMovieTypes(Movie_types movieTypes);

    void updateMovieTypes(Movie_types movieTypes);

    void deleteMovieTypes(Long id);

    List<Movie_types> getAllMovieTypes();
}
