package com.cap.feedback.service_interfaces;

import com.cap.feedback.entities.Employee;

import java.util.*;


public interface ITrainerManagementService {
	public Employee addTrainer(Employee emp);
	public Employee updateTrainer(Employee emp);
	public Employee removeTrainer(Employee emp);
	public Employee viewTrainer(Employee emp);
	public List<Employee> viewAllTrainers();
	
	
	

}
