package com.bmsm.dao;

import com.bmsm.common.entities.Employee;

public interface EmployeeDAO {
	
	void persistEmployee(Employee employee);

	Employee findEmployeeById(Long employeeId);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);
}
