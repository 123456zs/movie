package com.example.demo.service.impl;

import com.example.demo.entity.Banner;
import com.example.demo.mapper.BannerMapper;
import com.example.demo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public Banner getBannerById(Long id) {
        return bannerMapper.selectById(id);
    }

    @Override
    public void addBanner(Banner banner) {
        bannerMapper.insert(banner);
    }

    @Override
    public void updateBanner(Banner banner) {
        bannerMapper.update(banner);
    }

    @Override
    public void deleteBanner(Long id) {
        bannerMapper.deleteById(id);
    }

    @Override
    public List<Banner> getAllBanners() {
        return bannerMapper.selectAll();
    }
}
