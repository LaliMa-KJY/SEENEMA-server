package com.example.SEENEMA.domain.user.repository;

import com.example.SEENEMA.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    User findByNickname(String email);
    List<User> findAll();
}
