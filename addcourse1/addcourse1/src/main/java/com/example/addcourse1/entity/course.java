package com.example.addcourse1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private long id;

    private String title;
    private String category;
    private String description;
    private double difficulty;
    private int level;
    private boolean premium;


}
