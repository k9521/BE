package com.quiz.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.quiz.model.Question;
import com.quiz.repo.QuestionRepository;	
@RestController
public class WebController {
	@Autowired
	com.quiz.repo.QuestionRepository repository;
	
	
	
	@RequestMapping("/questions/random")
	public String randQuestions(){
		String result="";
		Optional<Question> quest;
		for(long id=1;id<20;id++){
			quest=repository.findById(id);
			result += quest.toString() + "<br>";
		}
		
		return result;
	}
	
}