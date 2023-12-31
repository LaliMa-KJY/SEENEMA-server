package com.example.SEENEMA.domain.theater.controller;

import com.example.SEENEMA.domain.theater.service.TheaterServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // 생성자 주입
@RequestMapping("/api/v1")
public class TheaterController {

    private final TheaterServiceImpl theaterService;

    @ApiOperation(value="공연장 조회")
    @GetMapping("/view-review/search")
    public ResponseEntity searchTheater(@RequestParam(name="q") String theaterName){
        return ResponseEntity.ok(theaterService. searchTheater(theaterName));
    }

    @ApiOperation(value="공연장 목록")
    @GetMapping("/theaters")
    public ResponseEntity getTheater(){
        return ResponseEntity.ok(theaterService.getTheater());
    }


    @ApiOperation(value="좌석 페이지 공연장 목록")
    @GetMapping("/seats")
    public ResponseEntity getSeatTheater(){
        return ResponseEntity.ok(theaterService.getSeatTheater());
    }

    @ApiOperation(value="좌석 페이지 공연장 조회")
    @GetMapping("/seats/search")
    public ResponseEntity searchSeatTheater(@RequestParam(name="q") String theaterName){
        return ResponseEntity.ok(theaterService. searchSeatTheater(theaterName));
    }
}
