package com.example.demo.service.impl;

import com.example.demo.entity.Comments;
import com.example.demo.mapper.CommentsMapper;
import com.example.demo.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private CommentsMapper commentsMapper;

    @Override
    public Comments getCommentById(Long id) {
        return commentsMapper.selectById(id);
    }

    @Override
    public void addComment(Comments comment) {
        commentsMapper.insert(comment);
    }

    @Override
    public void updateComment(Comments comment) {
        commentsMapper.update(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentsMapper.deleteById(id);
    }

    @Override
    public List<Comments> getAllComments() {
        return commentsMapper.selectAll();
    }
}
