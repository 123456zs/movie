package com.example.demo.service;

import com.example.demo.entity.Favorites;

import java.util.List;

public interface FavoritesService {

    Favorites getFavoriteById(Long id);

    void addFavorite(Favorites favorite);

    void updateFavorite(Favorites favorite);

    void deleteFavorite(Long id);

    List<Favorites> getAllFavorites();
}
