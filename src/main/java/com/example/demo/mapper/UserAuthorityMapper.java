package com.example.demo.mapper;

import com.example.demo.entity.User_authority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserAuthorityMapper {

    User_authority selectById(Long id);

    void insert(User_authority userAuthority);

    void update(User_authority userAuthority);

    void deleteById(Long id);

    List<User_authority> selectAll();
}
