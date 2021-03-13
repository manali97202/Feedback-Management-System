package com.cap.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.feedback.entities.Employee;

@Repository
public interface ITrainerManagementRepository extends JpaRepository<Employee, Integer>
{

}
