package com.bmsm.service;

import java.util.List;

import com.bmsm.common.entities.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	public void save(Customer customer);
	public List<Customer> findbyFirstName(String firstName);
	public List<Customer> findbyLastName(String lastName);
	public List<Customer> findbyDrivingLicense(String drivingLicense);
	public void update(Customer customer);
	public Customer findOne(int id);
	public List<Customer> findBy(String searchBy, String searchParam);
	public void remove(Integer id);
	
}
