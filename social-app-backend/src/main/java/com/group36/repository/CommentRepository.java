package com.group36.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group36.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
