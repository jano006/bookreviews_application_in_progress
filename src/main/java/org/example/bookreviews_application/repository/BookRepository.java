package org.example.bookreviews_application.repository;

import org.example.bookreviews_application.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
