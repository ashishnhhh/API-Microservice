package com.QuizService.Quiz_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QuizService.Quiz_service.entity.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
