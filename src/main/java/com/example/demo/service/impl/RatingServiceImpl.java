package com.example.demo.service.impl;

import com.example.demo.entity.Rating;
import com.example.demo.mapper.RatingMapper;
import com.example.demo.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingMapper ratingMapper;

    @Override
    public Rating getRatingById(Long id) {
        return ratingMapper.selectById(id);
    }

    @Override
    public void addRating(Rating rating) {
        ratingMapper.insert(rating);
    }

    @Override
    public void updateRating(Rating rating) {
        ratingMapper.update(rating);
    }

    @Override
    public void deleteRating(Long id) {
        ratingMapper.deleteById(id);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingMapper.selectAll();
    }
}
