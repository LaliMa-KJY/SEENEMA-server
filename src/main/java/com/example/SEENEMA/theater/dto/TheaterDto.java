package com.example.SEENEMA.theater.dto;


import com.example.SEENEMA.theater.domain.Theater;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TheaterDto {

    /** 검색한 공연장을 리턴할 Response 클래스 */
    @Getter
    public static class theaterResponse{
        private String theaterName;
        public theaterResponse(Theater theater){
            this.theaterName = theater.getTheaterName();
        }
    }

    @Getter
    public static class theaterList{
        private String theaterName;
        private String detailUrl;

        public theaterList(Theater theater) {
            this.theaterName = theater.getTheaterName();
            this.detailUrl = theater.getDetailUrl();
        }
    }
}
