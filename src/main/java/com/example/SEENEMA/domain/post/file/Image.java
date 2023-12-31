package com.example.SEENEMA.domain.post.file;

import lombok.AccessLevel;
import lombok.*;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "IMAGE")
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imgId;
    @Column
    private String imgUrl;
}
