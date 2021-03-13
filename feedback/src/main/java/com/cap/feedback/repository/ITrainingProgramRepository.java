package com.cap.feedback.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.feedback.entities.Program;

@Repository
public interface ITrainingProgramRepository extends JpaRepository<Program, Integer> 
{
	public List<Program> findProgramsByStartDate(LocalDate startdate);

}
