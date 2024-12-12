package com.example.demo.service.impl;

import com.example.demo.entity.Movie_types;
import com.example.demo.mapper.MovieTypesMapper;
import com.example.demo.service.MovieTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieTypesServiceImpl implements MovieTypesService {

    @Autowired
    private MovieTypesMapper movieTypesMapper;

    @Override
    public Movie_types getMovieTypesById(Long id) {
        return movieTypesMapper.selectById(id);
    }

    @Override
    public void addMovieTypes(Movie_types movieTypes) {
        movieTypesMapper.insert(movieTypes);
    }

    @Override
    public void updateMovieTypes(Movie_types movieTypes) {
        movieTypesMapper.update(movieTypes);
    }

    @Override
    public void deleteMovieTypes(Long id) {
        movieTypesMapper.deleteById(id);
    }

    @Override
    public List<Movie_types> getAllMovieTypes() {
        return movieTypesMapper.selectAll();
    }
}
