package com.bmsm.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmsm.common.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByFirstNameIgnoreCase(String firstName);
	
	public List<Employee> findByLastNameIgnoreCase(String lastName);

	
}
