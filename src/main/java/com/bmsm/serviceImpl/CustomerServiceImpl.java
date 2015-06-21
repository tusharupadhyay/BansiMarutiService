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
		return customerRepository.findByFirstNameIgnoreCase(firstName);
	}

	@Override
	public List<Customer> findbyLastName(String lastName) {
		return customerRepository.findByLastNameIgnoreCase(lastName);
	}

	@Override
	public List<Customer> findbyDrivingLicense(String drivingLicense) {		
		return customerRepository.findByDrivingLicenseIgnoreCase(drivingLicense);
	}
	
	

	@Override
	public void update(Customer customer) {

		Customer customerOld = customerRepository.findOne(customer.getId());

		copyTo(customerOld, customer);

		customerRepository.save(customerOld);
	}
	
	public void copyTo(Customer customerOld, Customer customerNew) {
		customerOld.setFirstName(customerNew.getFirstName());
		customerOld.setMiddleName(customerNew.getMiddleName());
		customerOld.setLastName(customerNew.getLastName());
		customerOld.setAddress_line1(customerNew.getAddress_line1());
		customerOld.setAddress_line2(customerNew.getAddress_line2());
		customerOld.setCity(customerNew.getCity());
		customerOld.setDateOfBirth(customerNew.getDateOfBirth());
		customerOld.setDistrict(customerNew.getDistrict());
		customerOld.setState(customerNew.getState());
		customerOld.setSex(customerNew.getSex());
		customerOld.setDrivingLicense(customerNew.getDrivingLicense());
		customerOld.setEmailId(customerNew.getEmailId());
		customerOld.setHomeNumber(customerNew.getHomeNumber());
		customerOld.setMobileNumber(customerNew.getMobileNumber());
		customerOld.setVehicle(customerNew.getVehicle());		
	}

	@Override
	public Customer findOne(int id) {		
		return customerRepository.findOne(id);
	}

	@Override
	public List<Customer> findBy(String searchBy, String searchParam) {		
		if ("1".equalsIgnoreCase(searchBy)) {
			return customerRepository.findByFirstNameIgnoreCase(searchParam);
		} else if ("2".equalsIgnoreCase(searchBy)) {
			return customerRepository.findByLastNameIgnoreCase(searchParam);
		}
		if ("3".equalsIgnoreCase(searchBy)) {
			return customerRepository.findByDrivingLicenseIgnoreCase(searchParam);
		}
		if ("4".equalsIgnoreCase(searchBy)) {
			return customerRepository.findByMobileNumberIgnoreCase(searchParam);
		}
		if ("5".equalsIgnoreCase(searchBy)) {
			return customerRepository.findByVehicleIgnoreCase(searchParam);
		} else {
			return null;
		}
	}

	@Override
	public void remove(Integer id) {		
		customerRepository.delete(id);		
	}
	
}
