package com.coding.BookApplication.Repository;

import com.coding.BookApplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
     public Book findBookByTitle(String title);
}
