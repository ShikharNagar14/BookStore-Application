package com.example.BookStoreApplication.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
    List<Book> findByCategory(String category);
    List<Book> findByRatingGreaterThanEqual(double rating);
    List<Book> findByTitleContainingIgnoreCase(String title);
}
