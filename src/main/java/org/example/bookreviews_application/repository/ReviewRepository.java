package org.example.bookreviews_application.repository;

import org.example.bookreviews_application.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
