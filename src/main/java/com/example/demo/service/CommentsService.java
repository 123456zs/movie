package com.example.demo.service;

import com.example.demo.entity.Comments;

import java.util.List;

public interface CommentsService {

    Comments getCommentById(Long id);

    void addComment(Comments comment);

    void updateComment(Comments comment);

    void deleteComment(Long id);

    List<Comments> getAllComments();
}
