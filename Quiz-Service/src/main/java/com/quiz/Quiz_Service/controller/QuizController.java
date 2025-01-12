package com.quiz.Quiz_Service.controller;

import com.quiz.Quiz_Service.entites.Quiz;
import com.quiz.Quiz_Service.services.QuizService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController {

    @Autowired
    private final QuizService quizService;

    @PostMapping
    public Quiz add(@RequestBody  Quiz quiz){
        return quizService.add(quiz);
    }


    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id){
        return quizService.getById(id);
    }

}
