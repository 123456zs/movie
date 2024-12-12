package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectById(Long id);

    void insert(User user);

    void update(User user);

    void deleteById(Long id);

    List<User> selectAll();
}
