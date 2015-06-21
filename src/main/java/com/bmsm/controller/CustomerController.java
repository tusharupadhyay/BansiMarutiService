package com.bmsm.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		model.addAttribute("page", "customer");
		return "customer";
	}
	
	@RequestMapping("/service/customer/showAllCustomer")
	public String getAllCustomers(Model model) throws JsonGenerationException, JsonMappingException, IOException{
		
		List<Customer> list = customerService.findAll();
		if(list != null) {
			ObjectMapper mapper = new ObjectMapper();		
			model.addAttribute("customers",  mapper.writeValueAsString(list));
		}
		else {
			model.addAttribute("error", "error");
		}
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
	
	@RequestMapping("/service/customer/searchBy")
	public String getSearchPage(Model model){
		model.addAttribute("page", "customers_search");	
		return "customers_search";
	}
	
	@RequestMapping(value="/service/customer/searchBy/{searchBy}/{searchParam}", method = RequestMethod.POST)
	public @ResponseBody String getCustomersSearched(@PathVariable("searchBy") String searchBy, @PathVariable("searchParam") String searchParam) throws JsonGenerationException, JsonMappingException, IOException {		
		List<Customer> customers = customerService.findBy(searchBy, searchParam);
		if(customers != null) {
			ObjectMapper mapper = new ObjectMapper();		
			return mapper.writeValueAsString(customers);
		}
		else {
			return null;
		}
	}
	
	@RequestMapping(value = "/service/customer/updateCustomer/{customerId}")
	public String getUpdateCustomerPage(@PathVariable String customerId, Model model) throws JsonGenerationException, JsonMappingException, IOException {		
			
		Customer customer = customerService.findOne(Integer.parseInt(customerId.trim()));		
		if(customer != null) {
			ObjectMapper mapper = new ObjectMapper();			
			model.addAttribute("customer", mapper.writeValueAsString(customer));
		}
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		model.addAttribute("date_format", format.format(new Date()));	
		return "customer_update";
	}	
	
	@RequestMapping(value = "/service/customer/updateCustomer/update", method = RequestMethod.POST)	
	public @ResponseBody String updateCustomer(@RequestParam String updateData ) throws JsonParseException, JsonMappingException, IOException {
		 ObjectMapper mapper = new ObjectMapper();		
		 Customer customer = mapper.readValue(updateData, Customer.class);		
		 customerService.update(customer);
		 return "Success";
	}
	
	@RequestMapping(value = "/service/customer/remove/{customerId}", method = RequestMethod.POST)	
	public @ResponseBody String removeCustomer(@PathVariable String customerId) {
		customerService.remove(Integer.parseInt(customerId.trim()));
		return "success";
	}
	
}