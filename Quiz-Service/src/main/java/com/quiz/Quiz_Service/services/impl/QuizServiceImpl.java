package com.quiz.Quiz_Service.services.impl;

import com.quiz.Quiz_Service.entites.Quiz;
import com.quiz.Quiz_Service.repositories.QuizRepository;
import com.quiz.Quiz_Service.services.QestionClients;
import com.quiz.Quiz_Service.services.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService{

    @Autowired
    private final QuizRepository quizRepository;
    @Autowired
    private final QestionClients qestionClients;


    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {

        List<Quiz>quizList=quizRepository.findAll();

         List<Quiz>newQuizList=quizList.stream().map(quiz -> {
            quiz.setQuestion(qestionClients.getQestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

         return newQuizList;

    }

    @Override
    public Quiz getById(Long id) {
        Quiz quiz=quizRepository.findById(id).orElse(null);
        quiz.setQuestion(qestionClients.getQestionOfQuiz(quiz.getId()));
        return quiz;

    }
}



