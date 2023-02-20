package com.example.SEENEMA.theater.domain;

import lombok.*;
import javax.persistence.*;


@Getter
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@Table (name="theater")
@Entity
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theaterId;

    @Column(nullable = false)
    private String theaterName;


    @Builder
    public Theater(Long theaterId, String theaterName) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
    }
}