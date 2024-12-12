package com.example.demo.service.impl;

import com.example.demo.entity.Favorites;
import com.example.demo.mapper.FavoritesMapper;
import com.example.demo.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritesServiceImpl implements FavoritesService {

    @Autowired
    private FavoritesMapper favoritesMapper;

    @Override
    public Favorites getFavoriteById(Long id) {
        return favoritesMapper.selectById(id);
    }

    @Override
    public void addFavorite(Favorites favorite) {
        favoritesMapper.insert(favorite);
    }

    @Override
    public void updateFavorite(Favorites favorite) {
        favoritesMapper.update(favorite);
    }

    @Override
    public void deleteFavorite(Long id) {
        favoritesMapper.deleteById(id);
    }

    @Override
    public List<Favorites> getAllFavorites() {
        return favoritesMapper.selectAll();
    }
}
