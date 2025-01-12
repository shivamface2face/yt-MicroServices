package com.qestion.services.impl;

import com.qestion.entites.Question;
import com.qestion.reposotries.QestionReposotries;
import com.qestion.services.QestionServices;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class QestionServicesImpl implements QestionServices {

    @Autowired
    private final QestionReposotries qestionReposotries;

    @Override
    public Question create(Question question) {
        return qestionReposotries.save(question);
    }

    @Override
    public List<Question> getAll() {
        return qestionReposotries.findAll();
    }

    @Override
    public Question getById(Long id) {
        return qestionReposotries.findById(id).orElse(null);
    }

    @Override
    public List<Question> getQuestionOfQuiz(Long quizId) {
        return qestionReposotries.findByQuizId(quizId);
    }
}
