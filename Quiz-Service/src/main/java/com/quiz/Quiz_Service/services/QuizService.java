package com.quiz.Quiz_Service.services;

import com.quiz.Quiz_Service.entites.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz>get();
    Quiz getById(Long id);
}
