package com.example.SEENEMA.mainPage.service;

import com.example.SEENEMA.mainPage.domain.Musical;
import com.example.SEENEMA.mainPage.dto.MainPageDto;
import com.example.SEENEMA.mainPage.dto.PlayDto;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface MainPageService {
    MainPageDto.reasponseDTO readRanking();
    List<PlayDto.musicalList> getMusicals();


}
