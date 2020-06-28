package com.junior.springswagger.api;

import com.junior.springswagger.domain.Book;
import com.junior.springswagger.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/save")
    public String saveBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @GetMapping("/searchBook/{bookId}")
    public Optional<Book> getBook(@PathVariable int bookId){
        return service.getBook(bookId);
    }

    @DeleteMapping("/delete/bookId")
    public List<Book> deleteBook(@PathVariable int bookId){
        return  service.removeBook(bookId);
    }
}