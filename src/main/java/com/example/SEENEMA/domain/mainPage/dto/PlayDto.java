package com.example.SEENEMA.domain.mainPage.dto;

import com.example.SEENEMA.domain.mainPage.domain.Concert;
import com.example.SEENEMA.domain.mainPage.domain.Musical;
import lombok.*;

@Getter
@Setter
public class PlayDto {
    @Getter
    @Setter
    @NoArgsConstructor
    public static class musicalList {
        private Long no;
        private String title;
        private String genre;
        private String date;
        private String place;
        private String cast;
        private String imgUrl;
        private String interparkUrl;
        private String melonUrl;
        private String elevenUrl;

        public musicalList(Long no, String imgUrl, String title, String place, String date) {
            this.no = no;
            this.title = title;
            this.imgUrl = imgUrl;
            this.place = place;
            this.date = date;
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class musicalInfo {
        private String title;
        private String genre;
        private String date;
        private String place;
        private String cast;
        private String imgUrl;
        private String interparkUrl;
        private String melonUrl;
        private String elevenUrl;


        public musicalInfo(Musical musical){
            this.title = musical.getTitle();
            this.genre = musical.getGenre();
            this.date = musical.getDate();
            this.place = musical.getPlace();
            this.cast = musical.getCast();
            this.imgUrl = musical.getImgUrl();
            this.interparkUrl = musical.getInterparkUrl();
            this.melonUrl = musical.getMelonUrl();
            this.elevenUrl = musical.getElevenUrl();
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class concertList {
        private Long no;
        private String title;
        private String genre;
        private String date;
        private String place;
        private String cast;
        private String imgUrl;
        private String interparkUrl;
        private String melonUrl;
        private String elevenUrl;
        public concertList(Long no, String imgUrl, String title, String place, String date) {
            this.no = no;
            this.title = title;
            this.imgUrl = imgUrl;
            this.place = place;
            this.date = date;
        }
        public Concert toEntity(){
            return Concert.builder()
                    .title(title)
                    .genre(genre)
                    .date(date)
                    .place(place)
                    .cast(cast)
                    .imgUrl(imgUrl)
                    .interparkUrl(interparkUrl)
                    .melonUrl(melonUrl)
                    .elevenUrl(elevenUrl)
                    .build();
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class concertInfo {
        private String title;
        private String genre;
        private String date;
        private String place;
        private String cast;
        private String imgUrl;
        private String interparkUrl;
        private String melonUrl;
        private String elevenUrl;


        public concertInfo(Concert concert){
            this.title = concert.getTitle();
            this.genre = concert.getGenre();
            this.date = concert.getDate();
            this.place = concert.getPlace();
            this.cast = concert.getCast();
            this.imgUrl = concert.getImgUrl();
            this.interparkUrl = concert.getInterparkUrl();
            this.melonUrl = concert.getMelonUrl();
            this.elevenUrl = concert.getElevenUrl();
        }
    }
}


