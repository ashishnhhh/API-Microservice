package com.QuestionService.Question_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.QuestionService.Question_service.entity.Question;
import com.QuestionService.Question_service.repository.QuestionRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService{

	private QuestionRepository questionRepository;
	
	@Override
	public Question create(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public List<Question> get() {
		return questionRepository.findAll();
	}

	@Override
	public Question getOne(Long id) {
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException());
	}

	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		return questionRepository.findByQuizId(quizId);
	}

}
