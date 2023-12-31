package com.example.SEENEMA.domain.mainPage.controller;


import com.example.SEENEMA.domain.mainPage.domain.Concert;
import com.example.SEENEMA.domain.mainPage.domain.Musical;
import com.example.SEENEMA.domain.mainPage.domain.MusicalRanking;
import com.example.SEENEMA.domain.mainPage.dto.MainPageDto;
import com.example.SEENEMA.domain.mainPage.dto.PlayDto;
import com.example.SEENEMA.domain.mainPage.service.MainPageServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MainPageController {
    @Autowired
    private MainPageServiceImpl service;

//    @ApiOperation(value = "SEE-NEMA 메인페이지")
//    @GetMapping("/")
//    public ResponseEntity<MainPageDto> readRanking() {
//        MainPageDto response = service.readRanking();
//        return ResponseEntity.ok(response);
//    }

    @ApiOperation(value = "SEE-NEMA 메인페이지")
    @GetMapping("/")
    public ResponseEntity<MainPageDto> readRanking() {
        MainPageDto response = new MainPageDto();

        List<MainPageDto.concertRanking> concertRankings = service.getConcertRankingsFromDatabase();
        response.setConcertRank(concertRankings);

        List<MainPageDto.musicalRanking> musicalRankings = service.getMusicalRankingsFromDatabase();
        response.setMusicalRank(musicalRankings);

        return ResponseEntity.ok(response);
    }
    @ApiOperation(value = "뮤지컬 목록")
    @GetMapping("/musicals")
    public ResponseEntity<List<PlayDto.musicalList>> getMusicalList() {
        return ResponseEntity.ok(service.getMusicalList());
    }

    @ApiOperation(value = "뮤지컬 상세정보")
    @GetMapping("/musicals/{no}")
    public ResponseEntity<PlayDto.musicalInfo> getMusicalInfo(@PathVariable("no") Long no){
        return ResponseEntity.ok(service.getMusicalInfo(no));
    }

    @ApiOperation(value = "콘서트 목록")
    @GetMapping("/concerts")
    public ResponseEntity<List<PlayDto.concertList>> getConcertList() {
        return ResponseEntity.ok(service.getConcertList());
    }

    @ApiOperation(value = "콘서트 상세정보")
    @GetMapping("/concerts/{no}")
    public ResponseEntity<PlayDto.concertInfo> getConcertInfo(@PathVariable("no") Long no){
        return ResponseEntity.ok(service.getConcertInfo(no));
    }

}
