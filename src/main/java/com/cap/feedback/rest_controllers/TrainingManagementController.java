
package com.cap.feedback.rest_controllers;


import java.util.Date;




import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cap.feedback.entities.Employee;
import com.cap.feedback.exceptions.FeedbackExceptions;
import com.cap.feedback.repository.ITrainerManagementRepository;
import com.cap.feedback.service_interfaces.ITrainerManagementService;
import com.cap.feedback.services.TrainerManagementService;



@RestController
public class TrainingManagementController {

	@Autowired
	private ITrainerManagementRepository cao;
	
	
	@Autowired
	private ITrainerManagementService iService;
	
	@PostMapping("/addTrainer")
	public Employee addTrainer(@RequestBody Employee emp) {
		System.out.println(emp);
		return cao.save(emp);
		
	}
	
	/*
	  */
	@PutMapping("/updateTrianer123")
	public Employee updateTrainer321(@RequestBody Employee emp)
	{
		//Employee emp1=new Employee();
		//emp.setEmployeeId(emp.getEmployeeId());
		//iService.viewTrainer(emp);
		System.out.println(emp);
		try {
			Employee emp1=cao.findById(emp.getEmployeeId()).get();
			cao.save(emp);
			return emp;
			
		}
		catch(NoSuchElementException e) {
			Employee emp2=new Employee();
			emp2.setEmployeeId(0);
			emp2.setEmployeeName("No Record Found");
			emp2.setPassword("No Password Found");
			return emp2;
			
			
		}
		
		
		//if(emp1==null) {
			//new FeedbackExceptions("Record Not Found");
			
	//	}
		//else {
		//return cao.save(emp);
		//}
		//return new Employee();
	}

	@DeleteMapping("/removeTrinerEntity")
	public Employee removeTrainer(@RequestBody Employee emp)
	{
		return iService.removeTrainer(emp);
	}
	
	@GetMapping("/viewTrainer/{employeeId}")
	public ResponseEntity<Employee> viewTrainer(@PathVariable Integer employeeId)
	{
		Employee emp=new Employee();
		emp.setEmployeeId(employeeId);
	    Employee emp1=iService.viewTrainer(emp);
		return new ResponseEntity<Employee>(emp1,HttpStatus.OK);
	}

	@GetMapping(value="/viewAllTrainerEntity")
	public ResponseEntity<List<Employee>> viewAllTrainers()
	{
		List<Employee> skill1=iService.viewAllTrainers();
		return new ResponseEntity<List<Employee>>(skill1,HttpStatus.OK);
	}








}