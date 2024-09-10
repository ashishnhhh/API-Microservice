package com.QuestionService.Question_service.service;

import java.util.List;

import com.QuestionService.Question_service.entity.Question;

public interface QuestionService {
	Question create (Question question);
	List<Question>get();
	Question getOne(Long id);
	List<Question> getQuestionsOfQuiz(Long quizId);
}
