package com.quiz.Quiz_Service.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Qestion {
    private Long qestionId;
    private String qestion;
    private Long quizId;
}