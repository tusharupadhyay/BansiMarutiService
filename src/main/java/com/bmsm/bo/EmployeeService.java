package com.bmsm.bo;

import com.bmsm.common.entities.Employee;

public interface EmployeeService {
	
	void persistEmployee(Employee employee);

	Employee findEmployeeById(Long employeeId);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);
}
