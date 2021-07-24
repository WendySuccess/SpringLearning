package com.wendy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendy.model.Tutorial;
import com.wendy.repository.TutorialRepository;

@Service
public class TutorialService {
	
 @Autowired
 TutorialRepository tutorialRepository;
 
 public List<Tutorial>getAllTutorial(){
	 //System.out.println(tutorialRepository.findAll());
	 return tutorialRepository.findAll();
 }
 
 public Tutorial addTutorial(Tutorial tutorial) {
	 return tutorialRepository.save(new Tutorial(0,tutorial.getTitle(),tutorial.getDescription()));
	 
 }
 
 public Optional<Tutorial>findTutorialById(Long id) {
//	 Optional<Tutorial>
	return null;
	 
	 
 }

}
