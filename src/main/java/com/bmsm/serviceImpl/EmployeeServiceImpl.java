package com.bmsm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmsm.common.entities.Employee;
import com.bmsm.jpa.repositories.EmployeeRepository;
import com.bmsm.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {		
		return employeeRepository.findAll();
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);		
	}

	@Override
	public List<Employee> findbyFirstName(String firstName) {		
		return employeeRepository.findByFirstNameIgnoreCase(firstName);
	}

	@Override
	public List<Employee> findbyLastName(String lastName) {		
		return employeeRepository.findByLastNameIgnoreCase(lastName);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findOne(int id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public void remove(Integer id) {
		employeeRepository.delete(id);
		
	}
}
