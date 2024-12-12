package com.example.demo.service;

import com.example.demo.entity.Rating;

import java.util.List;

public interface RatingService {

    Rating getRatingById(Long id);

    void addRating(Rating rating);

    void updateRating(Rating rating);

    void deleteRating(Long id);

    List<Rating> getAllRatings();
}
