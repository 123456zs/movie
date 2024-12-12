package com.example.demo.service.impl;

import com.example.demo.entity.Authority;
import com.example.demo.mapper.AuthorityMapper;
import com.example.demo.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public Authority getAuthorityById(Long id) {
        return authorityMapper.selectById(id);
    }

    @Override
    public void addAuthority(Authority authority) {
        authorityMapper.insert(authority);
    }

    @Override
    public void updateAuthority(Authority authority) {
        authorityMapper.update(authority);
    }

    @Override
    public void deleteAuthority(Long id) {
        authorityMapper.deleteById(id);
    }

    @Override
    public List<Authority> getAllAuthorities() {
        return authorityMapper.selectAll();
    }
}
