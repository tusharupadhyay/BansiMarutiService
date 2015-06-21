package com.bmsm.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmsm.common.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	//@Query("SELECT c FROM Customer c WHERE LOWER(c.firstName) = LOWER(:firstName)")
	public List<Customer> findByFirstNameIgnoreCase(/*@Param("firstName")*/ String firstName);

	public List<Customer> findByDrivingLicenseIgnoreCase(String drivingLicense);

	public List<Customer> findByLastNameIgnoreCase(String lastName);

	public List<Customer> findByMobileNumberIgnoreCase(String mobileNumber);

	public List<Customer> findByVehicleIgnoreCase(String vehicle);

	
}
