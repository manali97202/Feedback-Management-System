package com.cap.feedback.controllers;

import java.time.LocalDate;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.feedback.entities.Program;
import com.cap.feedback.service_interfaces.ITrainingProgramService;

//import antlr.collections.List;

@RestController
public class ProgramController {
	
	@Autowired
	private ITrainingProgramService iService;
	

	@PostMapping("/programs")
	public Program createProgram(@RequestBody Program p) {
		iService.createProgram(p).save(p);
		return p;
	}

	
	@GetMapping("/programs/{trainingId}")
	public ResponseEntity<Program> viewProgram(@PathVariable Integer trainingId)
	{
		System.out.println(trainingId);
		System.out.println(trainingId.getClass().getName());
	    Program p = new Program();
	    p.setTrainingId(trainingId);
	    Program p1=iService.viewProgram(p);
		return new ResponseEntity<Program>(p1,HttpStatus.OK);	
	}
	
	@GetMapping("/programs")
	public List<Program> showAllPrograms()
	{
		return iService.viewAllPrograms();
		
	}
	
	@GetMapping("/programs/{startDate}")
	public List<Program> showAllProgramsByDate(@PathVariable LocalDate startDate)
	{
		return iService.viewAllProgramsByDate(startDate);
	}
	
	
	@PutMapping("/programs")
	public Program updateProgram(@RequestBody Program p) {
		return iService.updateProgram(p);
		
	}
	
	@DeleteMapping("/programs")
	public Program deleteProgram1(@RequestBody Program p) {
		return iService.removeProgram(p);
		
	}
}










