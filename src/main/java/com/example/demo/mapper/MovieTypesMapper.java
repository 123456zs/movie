package com.example.demo.mapper;

import com.example.demo.entity.Movie_types;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieTypesMapper {

    Movie_types selectById(Long id);

    void insert(Movie_types movieTypes);

    void update(Movie_types movieTypes);

    void deleteById(Long id);

    List<Movie_types> selectAll();
}
