package com.bmsm.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import com.bmsm.common.entities.Customer;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/META-INF/dbUnit-context.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, TransactionDbUnitTestExecutionListener.class })
@Transactional
public class CustomerServiceTest {

	@Autowired
	private CustomerService customerService;
		
	@Test	
	@DatabaseSetup(value = "/META-INF/db/customer-dataset.xml")	
	public void testFindAll() {
		List<Customer> list = customerService.findAll();		
		Assert.assertNotNull(list);
		Assert.assertEquals(2, list.size());
	}
	
	@Test	
	@DatabaseSetup(value = "/META-INF/db/customer-dataset.xml")	
	public void testSave() {
		List<Customer> list = customerService.findAll();
		
		Assert.assertNotNull(list);
		Assert.assertEquals(2, list.size());
		Customer c = new Customer();		
		c.setId(201);
		c.setFirstName("Tushar");
		c.setLastName("Updhaya");
		
		customerService.save(c);		
		list =  customerService.findAll();		
		Assert.assertEquals(3, list.size());		
	}
	
}
