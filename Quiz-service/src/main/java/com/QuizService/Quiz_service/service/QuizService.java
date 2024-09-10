package com.QuizService.Quiz_service.service;

import java.util.List;

import com.QuizService.Quiz_service.entity.Quiz;

public interface QuizService {

	Quiz add(Quiz quiz);
	List<Quiz> get();
	Quiz get(Long id);
}
