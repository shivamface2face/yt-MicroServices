# Microservices Application with Feign Client Integration

This repository contains two Spring Boot microservices: **Question Service** and **Quiz Service**, which demonstrate inter-service communication using **Feign Client**.

---

## Table of Contents

- [Overview](#overview)
- [Services Description](#services-description)
  - [Question Service](#question-service)
  - [Quiz Service](#quiz-service)
- [Inter-Service Communication](#inter-service-communication)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Endpoints](#endpoints)

---

## Overview

The application is designed to manage quizzes and their related questions.  
- **Question Service** handles CRUD operations for questions.  
- **Quiz Service** manages quizzes and fetches related questions from the Question Service using **Feign Client**.

---

## Services Description

### Question Service
The **Question Service** provides functionalities to:
- Create a new question
- Retrieve all questions
- Fetch a question by its ID
- Get questions associated with a specific quiz
Inter-Service Communication
Feign Client Integration
The Quiz Service communicates with the Question Service using Feign Client.

## Feign Client Interface:


@FeignClient(name = "question-service", url = "http://localhost:8081")

public interface QestionClients {

    @GetMapping("/questions/quiz/{quizId}")
    
    List<Question> getQestionOfQuiz(@PathVariable("quizId") Long quizId);
    
}

When the Quiz Service fetches a quiz, it uses the Feign Client to call the Question Service and retrieve associated questions.



