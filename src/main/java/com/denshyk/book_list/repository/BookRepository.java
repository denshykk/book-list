package com.denshyk.book_list.repository;

import com.denshyk.book_list.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}