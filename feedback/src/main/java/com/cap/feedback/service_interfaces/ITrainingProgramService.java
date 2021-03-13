package com.cap.feedback.service_interfaces;
import java.time.LocalDate;
import java.util.List;
import com.cap.feedback.entities.Program;

public interface ITrainingProgramService 
{
	public Program createProgram(Program p);
	
	public Program updateProgram(Program p);
	
	public Program removeProgram(Program p);
	
	public Program viewProgram(Program p);
	
	public List<Program> viewAllPrograms();
	
	public List<Program> viewAllProgramsByDate(LocalDate startdate);
	
	public List<Program> viewAllProgramsByFaculty(int empid);

	public void save(Program p);
}
