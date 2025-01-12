package com.quiz.Quiz_Service.services;

import com.quiz.Quiz_Service.entites.Qestion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082",value = "qestion-clinet")
public interface QestionClients {


    @GetMapping("/qestion/quiz/{quizId}")
    List<Qestion> getQestionOfQuiz(@PathVariable Long quizId);

}
