package com.example.TD4.Service;

import com.example.TD4.Model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final List<Book> books = List.of(
            new Book("Java Basics", "John Smith"),
            new Book("Spring Boot Guide", "Alice Brown"),
            new Book("Clean Code", "Robert Martin"));

    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }
}