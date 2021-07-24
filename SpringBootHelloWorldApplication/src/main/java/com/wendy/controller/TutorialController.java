package com.wendy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendy.model.Tutorial;
import com.wendy.repository.TutorialRepository;
import com.wendy.service.TutorialService;

@RestController
@RequestMapping("/Tutorial")
public class TutorialController {
	
	@Autowired
	TutorialRepository tutorialRespository;
	
	@Autowired
	TutorialService tutorialService;
	
	@GetMapping("/")
	public ResponseEntity<List<Tutorial>> getTutorial() {
		try {
			 System.out.println(tutorialService.getAllTutorial());
			List<Tutorial> tutorials = tutorialService.getAllTutorial();
			System.out.println("below is ");
			System.out.println(tutorials );
			System.out.println(tutorials.isEmpty());
			if(tutorials.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			}
			else {
				return new ResponseEntity<>(tutorials, HttpStatus.OK);
			}
			
		} catch (Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		

		
		
	}
	
	@PostMapping("/")
	public ResponseEntity<Tutorial> addTutorial(@RequestBody Tutorial tutorial){
		Tutorial tutorialCreated = tutorialRespository.save(new Tutorial(0, tutorial.getTitle(),tutorial.getDescription()));
		
		if(tutorialCreated !=null) {
		return new ResponseEntity<>(tutorialCreated ,HttpStatus.CREATED);
		}
		return new ResponseEntity<>(null ,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
