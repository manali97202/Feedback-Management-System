package com.cap.feedback.entities;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Program 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer trainingId;
	//@Temporal(TemporalType.DATE)
	private LocalDate startDate;
	//@Temporal(TemporalType.DATE)
	private LocalDate endDate;
	//private Course course;
	//private Employee faculty;
	public Integer getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Program [trainingId=" + trainingId + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
	

}
