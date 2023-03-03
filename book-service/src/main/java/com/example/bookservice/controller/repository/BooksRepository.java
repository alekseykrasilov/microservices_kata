package com.example.bookservice.controller.repository;

import com.example.bookservice.controller.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends MongoRepository<Book,String> {
}
