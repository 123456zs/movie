package com.example.demo.mapper;

import com.example.demo.entity.Comments;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentsMapper {

    Comments selectById(Long id);

    void insert(Comments comment);

    void update(Comments comment);

    void deleteById(Long id);

    List<Comments> selectAll();
}
