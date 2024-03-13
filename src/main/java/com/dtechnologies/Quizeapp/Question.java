package com.dtechnologies.Quizeapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String category;
    private String difficultlevel;
    private String option1;
    private String option2;
    private String option3;
    private String correctanswer;
    private String question;

}
