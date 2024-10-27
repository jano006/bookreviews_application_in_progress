package org.example.bookreviews_application.repository;

import org.example.bookreviews_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
