package com.example.SEENEMA.domain.mainPage.repository;

import com.example.SEENEMA.domain.mainPage.domain.Concert;
import com.example.SEENEMA.domain.mainPage.domain.Musical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicalRepository extends JpaRepository<Musical, Long> {
    List<Musical> findByTitleAndDateAndPlace(String title, String date, String place);
    List<Musical> findByCastContaining(String cast);
    List<Musical> findByGenreContaining(String genre);
    List<Musical> findByTitleContainingIgnoreCase(String title);
}
