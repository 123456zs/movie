package com.example.demo.service;

import com.example.demo.entity.Banner;

import java.util.List;

public interface BannerService {

    Banner getBannerById(Long id);

    void addBanner(Banner banner);

    void updateBanner(Banner banner);

    void deleteBanner(Long id);

    List<Banner> getAllBanners();
}
