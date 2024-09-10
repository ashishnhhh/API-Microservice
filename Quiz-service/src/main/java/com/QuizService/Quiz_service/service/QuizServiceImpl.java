package com.QuizService.Quiz_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.QuizService.Quiz_service.entity.Quiz;
import com.QuizService.Quiz_service.repository.QuizRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QuizServiceImpl implements QuizService {
	
	private QuizRepository quizRepository;
	
	private QuestionClient questionClient;

	@Override
	public Quiz add(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		List<Quiz> quzzies = quizRepository.findAll();
		
		List< Quiz> newQuizlist = quzzies.stream().map(quiz -> {
			quiz.setQuestions(questionClient.getQuestionQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		return newQuizlist;
	}

	@Override
	public Quiz get(Long id) {
		Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
		quiz.setQuestions(questionClient.getQuestionQuiz(quiz.getId()));
		return quiz;
	}

}
