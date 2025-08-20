package com.graphql.learn.Repo;

import com.graphql.learn.entities.book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepo extends JpaRepository<book, Integer> {
}
