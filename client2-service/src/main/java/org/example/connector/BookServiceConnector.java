package org.example.connector;

import org.example.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Book;
import java.util.List;

@FeignClient(name = "BOOK-SERVICE", url = "${book-service.url}",
        configuration = FeignConfig.class)
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}
