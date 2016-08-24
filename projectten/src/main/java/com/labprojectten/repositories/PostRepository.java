package com.labprojectten.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labprojectten.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
