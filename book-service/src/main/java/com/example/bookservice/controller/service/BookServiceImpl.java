package com.example.bookservice.controller.service;

import lombok.AllArgsConstructor;
import com.example.bookservice.controller.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookservice.controller.repository.BooksRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{
    @Autowired
    private final BooksRepository booksRepository;

    @Override
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }
}
