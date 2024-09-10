package com.QuizService.Quiz_service.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.QuizService.Quiz_service.entity.Question;

//@FeignClient(url = "http://localhost:8083", value = "Question-Client")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {

	@GetMapping("/question/quiz/{quizId}")
	 List<Question> getQuestionQuiz(@PathVariable Long quizId);
	
}
