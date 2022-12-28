package com.Autocare.BennyGarage.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Autocare.BennyGarage.DAO.CustomerRepository;
import com.Autocare.BennyGarage.Entity.Customer;

@Service
public class CustomerService
{
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer cust)
	{
		return customerRepository.save(cust);
	}

	public Optional<Customer> findCustomerById(Long id) 
	{
		return customerRepository.findById(id); 
	}

	public String deleteCustomer(Long id)
	{
		customerRepository.deleteById(id);
		return "record delete successfully";
	}

	public Customer updateCustomer(Customer customer)
	{
		customerRepository.save(customer);
		return customer;
	}

}
	

	