package com.QuizService.Quiz_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QuizService.Quiz_service.entity.Quiz;
import com.QuizService.Quiz_service.service.QuizService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/quiz")
public class QuizController {

	private QuizService quizService;
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return quizService.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> get(){
		return quizService.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable("id") Long id){
		return quizService.get(id);
		
	}
}
