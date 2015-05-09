package com.bmsm.main;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bmsm.bo.EmployeeService;
import com.bmsm.common.entities.Address;
import com.bmsm.common.entities.Employee;
import com.bmsm.common.util.States;

public class App {
	public static void main(String[] args){
		System.out.println("load context");

		ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		EmployeeService employeeBo = (EmployeeService) appContext.getBean("employeeService");
		
		Employee emp = new Employee();
        /*emp.setFirstName("Bansi");
        emp.setLastName("Lal");
        emp.setSalary(10000000);
        emp.setJobStart(new Date());
        emp.setPosition("Manager Director");
        emp.setDateOfBirth(new Date());    
                        
        Address add = new Address();
        add.setCity("Vijaypur");
        add.setDistrict("Samba");
        add.setLine1("Street 1");
        add.setLine2("Street 2");
        add.setLine3("Near X");
        add.setState(States.HR);        
        //add.setEmployee(emp);       
        emp.getAddresses().add(add);
        
        Set<Address> s = new HashSet<Address>();
        s.add(add);
        
        emp.setAddresses(s);*/
		
		emp = employeeBo.findEmployeeById(10L);
		
        System.out.println("Name : " + emp.getFirstName());
        //employeeBo.persistEmployee(emp);
		
	}
}
