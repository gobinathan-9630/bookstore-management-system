package com.skybrisk.bookstore.service;

import com.skybrisk.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book(1, "Java Basics", "James", 499));
        books.add(new Book(2, "Spring Boot", "Rod Johnson", 699));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
