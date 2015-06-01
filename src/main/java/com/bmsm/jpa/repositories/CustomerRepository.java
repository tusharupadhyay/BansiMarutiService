package com.bmsm.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmsm.common.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public List<Customer> findByFirstName(String firstName);

	public List<Customer> findByDrivingLicense(String drivingLicense);

	public List<Customer> findByLastName(String lastName);
	
}
