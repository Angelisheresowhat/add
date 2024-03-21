package com.example.addcourse1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "lesson_id")
    private long id;
    private String title;
    private String lesson_video;
    private String lesson_description;
    @OneToMany(mappedBy = "lesson",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<chapter> Chapters;

}

