package com.example.SergioBlogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SergioBlogs.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
