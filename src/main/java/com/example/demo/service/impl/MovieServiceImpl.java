package com.example.demo.service.impl;

import com.example.demo.entity.Movie;
import com.example.demo.mapper.MovieMapper;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public Movie getMovieById(Long id) {
        return movieMapper.selectById(id);
    }

    @Override
    public void addMovie(Movie movie) {
        movieMapper.insert(movie);
    }

    @Override
    public void updateMovie(Movie movie) {
        movieMapper.update(movie);
    }

    @Override
    public void deleteMovie(Long id) {
        movieMapper.deleteById(id);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieMapper.selectAll();
    }
}
