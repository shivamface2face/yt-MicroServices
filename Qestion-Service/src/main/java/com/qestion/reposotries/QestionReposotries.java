package com.qestion.reposotries;

import com.qestion.entites.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QestionReposotries extends JpaRepository<Question,Long> {

    List<Question>findByQuizId(Long quizId);

}
