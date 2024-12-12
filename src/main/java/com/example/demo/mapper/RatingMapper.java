package com.example.demo.mapper;

import com.example.demo.entity.Rating;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RatingMapper {

    Rating selectById(Long id);

    void insert(Rating rating);

    void update(Rating rating);

    void deleteById(Long id);

    List<Rating> selectAll();
}
