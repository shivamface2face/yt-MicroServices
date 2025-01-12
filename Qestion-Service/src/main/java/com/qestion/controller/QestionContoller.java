package com.qestion.controller;

import com.qestion.entites.Question;
import com.qestion.services.QestionServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qestion")
@RequiredArgsConstructor
public class QestionContoller {

    @Autowired
    private final QestionServices qestionServices;

    @PostMapping
    public Question create(@RequestBody Question question){
       return qestionServices.create(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return qestionServices.getAll();
    }

    @GetMapping("/{id}")
    public Question findById(@PathVariable Long id){
        return qestionServices.getById(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question>getQuestionOfQuiz(@PathVariable Long quizId){
        return qestionServices.getQuestionOfQuiz(quizId);
    }

}
