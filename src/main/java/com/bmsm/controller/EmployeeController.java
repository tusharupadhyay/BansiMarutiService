package com.bmsm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmsm.common.entities.Employee;
import com.bmsm.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@ModelAttribute("employee")
	public Employee constructor(){
		return new Employee();
	}
	
	@RequestMapping("/service/employee/searchBy")
	public String getSearchByPage(Model model) {
		model.addAttribute("page", "employee_search");
		return "employee_search";
	}
	
	@RequestMapping("/service/employee/addEmployee")
	public String getAddEmployeePage(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		model.addAttribute("date_format", format.format(new Date()));
		model.addAttribute("page", "employee_add");		
		return "employee_add";
	}
	
	@RequestMapping(value="/service/employee/addEmployee" , method=RequestMethod.POST)
	public String doAddCustomer(@Valid @ModelAttribute("employee") Employee employee, BindingResult result){	
		if(result.hasErrors()) {		
			return "employee_add";
		}
		employeeService.save(employee);
		return "redirect:/service/employee/addEmployee?success=true";
	}
	
	
}
