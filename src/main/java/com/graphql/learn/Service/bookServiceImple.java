package com.graphql.learn.Service;

import com.graphql.learn.Repo.bookRepo;
import com.graphql.learn.entities.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookServiceImple implements bookService{

    private bookRepo bookRepo;

    @Autowired
    public bookServiceImple(com.graphql.learn.Repo.bookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public book create(book Book) {
        return this.bookRepo.save(Book);
    }

    @Override
    public List<book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public book get(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("book are not found"));
    }
}
