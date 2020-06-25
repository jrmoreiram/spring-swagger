package com.junior.springswagger.api;

import com.junior.springswagger.domain.Book;
import com.junior.springswagger.service.BookService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService service;

    public String saveBook(@RequestBody Book book){
        return service.saveBook(book);
    }
}
