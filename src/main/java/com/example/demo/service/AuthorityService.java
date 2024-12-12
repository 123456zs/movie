package com.example.demo.service;

import com.example.demo.entity.Authority;

import java.util.List;

public interface AuthorityService {

    Authority getAuthorityById(Long id);

    void addAuthority(Authority authority);

    void updateAuthority(Authority authority);

    void deleteAuthority(Long id);

    List<Authority> getAllAuthorities();
}
