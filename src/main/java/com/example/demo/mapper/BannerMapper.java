package com.example.demo.mapper;

import com.example.demo.entity.Banner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BannerMapper {

    Banner selectById(Long id);

    int insert(Banner banner);

    int update(Banner banner);

    int deleteById(Long id);

    List<Banner> selectAll();
}
