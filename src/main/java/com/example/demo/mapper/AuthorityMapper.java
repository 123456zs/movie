package com.example.demo.mapper;

import com.example.demo.entity.Authority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorityMapper {

    Authority selectById(Long id);

    void insert(Authority authority);

    void update(Authority authority);

    void deleteById(Long id);

    List<Authority> selectAll();
}
