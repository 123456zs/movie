package com.example.demo.mapper;

import com.example.demo.entity.Favorites;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FavoritesMapper {

    Favorites selectById(Long id);

    void insert(Favorites favorite);

    void update(Favorites favorite);

    void deleteById(Long id);

    List<Favorites> selectAll();
}
