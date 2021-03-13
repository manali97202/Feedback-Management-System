package com.cap.feedback.services;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.feedback.entities.Program;
import com.cap.feedback.repository.ITrainingProgramRepository;
import com.cap.feedback.service_interfaces.ITrainingProgramService;

@Service
public class TrainingProgramService implements ITrainingProgramService
{
	
	//@Autowired
	//ITrainingProgramRepository trainingProgramRepository;
	
	@Autowired
	private ITrainingProgramRepository centerDao;
	
	
	public TrainingProgramService() {
		
	}
	
	@Override
	public Program createProgram(Program p) {
		centerDao.save(p);
		return p;
	}

	@Override
	public Program updateProgram(Program p) {
		centerDao.save(p);
		return p;
	}

	
	

	@Override
	public Program viewProgram(Program p) {
		//return centerDao.findById(p.getTrainingId()).get();
		Program p1 = null;
		try
		{
		 p1=centerDao.findById(p.getTrainingId()).get();
		}
		catch(NoSuchElementException e)
		{
			 p1=new Program();
		}
		return p1;
		
	}

	@Override
	public List<Program> viewAllPrograms() {
		return centerDao.findAll();
		
	}

	@Override
	public List<Program> viewAllProgramsByDate(LocalDate startdate) {
		return centerDao.findProgramsByStartDate(startdate);
	}

	@Override
	public List<Program> viewAllProgramsByFaculty(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void save(Program p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Program removeProgram(Program p) {
		centerDao.deleteById(p.getTrainingId());
		return p;
		 
	}
	
	

}
