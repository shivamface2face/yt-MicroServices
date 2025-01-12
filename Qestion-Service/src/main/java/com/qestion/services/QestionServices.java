package com.qestion.services;

import com.qestion.entites.Question;

import java.util.List;

public interface QestionServices {

    Question create(Question question);
    List<Question>getAll();
    Question getById(Long id);
    List<Question>getQuestionOfQuiz(Long quizId);

}
