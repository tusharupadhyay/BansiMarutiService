package com.bmsm.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmsm.common.entities.Customer;
import com.bmsm.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@ModelAttribute("customer")
	public Customer constructor(){
		return new Customer();
	}
	
	@RequestMapping("/service/customer")
	public String getCustomerPage(Model model){
		model.addAttribute("customers", customerService.findAll());
		model.addAttribute("page", "customer");
		return "customer";
	}
	
	@RequestMapping("/service/customer/showAllCustomer")
	public String getAllCustomers(Model model){
		model.addAttribute("customers", customerService.findAll());
		model.addAttribute("page", "customer_show");
		return "customers_show";
	}
	
	@RequestMapping("/service/customer/addCustomer")
	public String addCustomer(Model model){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		model.addAttribute("date_format", format.format(new Date()));
		model.addAttribute("page", "customer_add");
		return "add_customer";
	}
	
	@RequestMapping(value="/service/customer/addCustomer" , method=RequestMethod.POST)
	public String doAddCustomer(@ModelAttribute("customer") Customer customer){		
		customerService.save(customer);
		return "redirect:/service/customer/addCustomer?success=true";
	}
	
	@RequestMapping("/service/customer/searchByFirstName")
	public String searchByFirstName(Model model){
		model.addAttribute("page", "customers_search_first");	
		model.addAttribute("seachByParam", "First Name..");
		return "customers_search";
	}
	
	@RequestMapping("/service/customer/searchByLastName")
	public String searchByLastName(Model model){
		model.addAttribute("page", "customers_search_last");	
		model.addAttribute("seachByParam", "Last Name..");
		return "customers_search";
	}
	
	@RequestMapping("/service/customer/searchByDL")
	public String searchByDL(Model model){
		model.addAttribute("page", "customers_search_DL");	
		model.addAttribute("seachByParam", "Driving License..");
		return "customers_search";
	}
	
	@RequestMapping(value="/service/customer/searchByFirstName/{firstName}", method = RequestMethod.GET)
	public @ResponseBody String getShopInJSON(@PathVariable String firstName) throws JsonGenerationException, JsonMappingException, IOException {		
		List<Customer> customers = customerService.findbyFirstName(firstName);
		for(Customer customer : customers) {
			System.out.println(customer.toString());
		}
		ObjectMapper mapper = new ObjectMapper();		
		return mapper.writeValueAsString(customers);
	}
	
	
}
