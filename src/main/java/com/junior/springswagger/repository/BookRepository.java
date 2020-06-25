package com.junior.springswagger.repository;

import com.junior.springswagger.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
