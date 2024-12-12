package com.example.demo.service.impl;

import com.example.demo.entity.User_authority;
import com.example.demo.mapper.UserAuthorityMapper;
import com.example.demo.service.UserAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAuthorityServiceImpl implements UserAuthorityService {

    @Autowired
    private UserAuthorityMapper userAuthorityMapper;

    @Override
    public User_authority getUserAuthorityById(Long id) {
        return userAuthorityMapper.selectById(id);
    }

    @Override
    public void addUserAuthority(User_authority userAuthority) {
        userAuthorityMapper.insert(userAuthority);
    }

    @Override
    public void updateUserAuthority(User_authority userAuthority) {
        userAuthorityMapper.update(userAuthority);
    }

    @Override
    public void deleteUserAuthority(Long id) {
        userAuthorityMapper.deleteById(id);
    }

    @Override
    public List<User_authority> getAllUserAuthorities() {
        return userAuthorityMapper.selectAll();
    }
}
