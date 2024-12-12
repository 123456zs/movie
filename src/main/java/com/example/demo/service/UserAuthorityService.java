package com.example.demo.service;

import com.example.demo.entity.User_authority;

import java.util.List;

public interface UserAuthorityService {

    User_authority getUserAuthorityById(Long id);

    void addUserAuthority(User_authority userAuthority);

    void updateUserAuthority(User_authority userAuthority);

    void deleteUserAuthority(Long id);

    List<User_authority> getAllUserAuthorities();
}
