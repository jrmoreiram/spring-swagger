package com.junior.springswagger.service;

import com.junior.springswagger.domain.Book;
import com.junior.springswagger.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public String saveBook(Book book){
        repository.save(book);
        return "Book save with success id " + book.getBookId();
    }

    public Optional<Book> getBook(int bookId){
        return repository.findById(bookId);
    }

    public List<Book> removeBook(int bookId){
        repository.deleteById(bookId);
        return repository.findAll();
    }
}
