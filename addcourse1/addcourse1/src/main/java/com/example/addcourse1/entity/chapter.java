package com.example.addcourse1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "chapter_id")
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    @JsonIgnore
    private lesson lesson;

}
