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
    private Long theater_id;

    @Column(nullable = false)
    private String theater_name;

}