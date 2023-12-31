package com.example.SEENEMA.domain.post.file;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    @Override
    List<Image> findAll();
}
