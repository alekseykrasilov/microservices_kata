package com.example.bookservice.controller.controller;

import lombok.AllArgsConstructor;
import com.example.bookservice.controller.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookservice.controller.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookRestController {
    @Autowired
    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
