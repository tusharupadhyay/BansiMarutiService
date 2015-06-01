package com.bmsm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmsm.common.entities.Customer;
import com.bmsm.jpa.repositories.CustomerRepository;
import com.bmsm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {		
		return customerRepository.findAll();
	}

	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);		
	}

	@Override
	public List<Customer> findbyFirstName(String firstName) {
		return customerRepository.findByFirstName(firstName);
	}

	@Override
	public List<Customer> findbyLastName(String lastName) {
		return customerRepository.findByLastName(lastName);
	}

	@Override
	public List<Customer> findbyDrivingLicense(String drivingLicense) {
		return customerRepository.findByDrivingLicense(drivingLicense);
	}
	
	
}
