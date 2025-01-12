package com.quiz.Quiz_Service.repositories;

import com.quiz.Quiz_Service.entites.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
