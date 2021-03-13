package com.cap.feedback.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.feedback.entities.Employee;
import com.cap.feedback.repository.ITrainerManagementRepository;
import com.cap.feedback.service_interfaces.ITrainerManagementService;

@Service
public class TrainerManagementService implements ITrainerManagementService 
{
	//@Autowired
	//TrainerManagementService trainerManagementService;
	
	
	@Autowired
	private ITrainerManagementRepository cDao;

	public TrainerManagementService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee addTrainer(Employee emp) {
		System.out.println(emp);
		cDao.save(emp);
		return emp;
	}

	@Override
	public Employee updateTrainer(Employee emp) {
		cDao.save(emp);
		return emp;
	}

	@Override
	public Employee removeTrainer(Employee emp) {
		cDao.deleteById(emp.getEmployeeId());
		return emp;
		 
	}

	
	@Override
	public Employee viewTrainer(Employee emp) {
		Employee emp1 = null;
		try
		{
		 emp1=cDao.findById(emp.getEmployeeId()).get();
		}
		catch(NoSuchElementException e)
		{
			 emp1=new Employee();
		}
		return emp1;
	}

	

	@Override
	public List<Employee> viewAllTrainers() {
		// TODO Auto-generated method stub
		return cDao.findAll();
	}

	

}
