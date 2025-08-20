package com.graphql.learn.Service;

import com.graphql.learn.entities.book;

import java.util.List;

public interface bookService {

    book create(book Book );
    List<book> getAll();
    book get(int bookId);

}
