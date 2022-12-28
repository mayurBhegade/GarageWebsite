package com.Autocare.BennyGarage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Autocare.BennyGarage.Entity.Customer;
import com.Autocare.BennyGarage.service.CustomerService;

@RestController
public class CustomerController 
{
	@Autowired
	CustomerService customerService;
	
	

	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/customer/{id}")
	public Optional<Customer>findCustomerById(@PathVariable Long id)
	{
		return customerService.findCustomerById(id);
	}
	
	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable Long id)
	{
		return customerService.deleteCustomer(id);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return customerService.updateCustomer(customer);
	}
	
}	
