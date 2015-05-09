package com.bmsm.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bmsm.common.entities.Employee;
import com.bmsm.dao.EmployeeDAO;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void persistEmployee(Employee employee) {
		sessionFactory.getCurrentSession().persist(employee);
	}

	@Transactional
	public Employee findEmployeeById(Long employeeId) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
	}
	
	@Transactional
	public void updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);

	}
	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);

	}

}