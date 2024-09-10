package com.QuestionService.Question_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QuestionService.Question_service.entity.Question;
import com.QuestionService.Question_service.service.QuestionService;

import jakarta.annotation.security.PermitAll;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/question")
@AllArgsConstructor
public class QuestionController {

	private QuestionService questionService;
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}

	@GetMapping
	public List<Question> get(){
		return questionService.get();
	}
	
	@GetMapping("/{questionId}")
	public Question getAll(@PathVariable Long questionId) {
		return questionService.getOne(questionId);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsOfQuiz(quizId);
		
	}
}
