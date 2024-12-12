package com.example.demo.mapper;

import com.example.demo.entity.Types;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypesMapper {

    Types selectById(Long id);

    void insert(Types types);

    void update(Types types);

    void deleteById(Long id);

    List<Types> selectAll();
}
