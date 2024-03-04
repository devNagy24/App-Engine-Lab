package org.example.appenginelab.controller;

import org.example.appenginelab.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book("Paperback", "J.K. Rowling", "Harry Potter and the Sorcerer's Stone"),
                new Book("Hardcover", "J.R.R. Tolkien", "The Lord of the Rings"),
                new Book("Ebook", "George Orwell", "1984")
        );
    }
}
