package com.bmsm.service;

import java.util.List;

import com.bmsm.common.entities.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	public void save(Employee employee);
	public List<Employee> findbyFirstName(String firstName);
	public List<Employee> findbyLastName(String lastName);
	public void update(Employee employee);
	public Employee findOne(int id);
	public void remove(Integer id);
	
}
