package com.graphql.learn.Controller;

import com.graphql.learn.Service.bookService;
import com.graphql.learn.entities.book;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class bookController {

    @Autowired
    private bookService BookService;

    @MutationMapping("createBook")
    public book createBook(@Argument("book") BookInput bookInput) {
        book newBook = new book();
        newBook.setTitle(bookInput.getTitle());
        newBook.setDescription(bookInput.getDescription());
        newBook.setAuthor(bookInput.getAuthor());
        newBook.setPrice(bookInput.getPrice());
        newBook.setPages(bookInput.getPages());

        return BookService.create(newBook);
    }


    @QueryMapping("getALL")
    public List<book> getAll() {
        return BookService.getAll();
    }

    @QueryMapping("bookgetbyId")
    public book bookgetbyId(@Argument int id) {
        return BookService.get(id);
    }
}


//@Getter
//@Setter
//@Data
class BookInput{
    private String title;

    private String description;

    private String author;

    private double price;

    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
