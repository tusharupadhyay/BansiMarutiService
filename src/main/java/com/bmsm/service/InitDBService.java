package com.bmsm.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmsm.common.entities.Address;
import com.bmsm.common.entities.Customer;
import com.bmsm.common.entities.user.Role;
import com.bmsm.common.entities.user.User;
import com.bmsm.common.util.States;
import com.bmsm.jpa.repositories.AddressRepository;
import com.bmsm.jpa.repositories.CustomerRepository;
import com.bmsm.jpa.repositories.RoleRepository;
import com.bmsm.jpa.repositories.UserRepository;

@Service
public class InitDBService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@PostConstruct
	public void init() {
		
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setUserName("admin");
		userAdmin.setPassword("admin");		
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		/*Address address1 = new Address();
		address1.setCity("Jammu");
		address1.setState(States.JK);
		addressRepository.save(address1);
		
		Address address2 = new Address();
		address2.setCity("Pune");
		address2.setState(States.MH);
		addressRepository.save(address2);*/
				
		Customer customer = new Customer();
		customer.setFirstName("Sahil");
		customer.setLastName("Sharma");
		customer.setMiddleName("Lal");
		customer.setHomeNumber("32165498");
		customer.setMobileNumber("132548986");
		customer.setAddress_line1("Line 1");
		customer.setAddress_line2("Line 2");
		customer.setCity("Jammu");
		customer.setSex("Male");
		customer.setState("Jammu And Kashmir");
		customer.setDistrict("Samba");
		customer.setDrivingLicense("12345675");
		customer.setEmailId("spatayar@gmail.com");
		customer.setVehicle("AUDI");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		customer.setDateOfBirth(format.format(new Date()));
		/*List<Address> addresses = new ArrayList<Address>();*/
		/*addresses.add(address1);
		addresses.add(address2);*/
		customerRepository.save(customer);
		
		
		
		
		
	}

}
