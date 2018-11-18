package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

import com.pluralsight.Repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository;

	/*  Using Setter Injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	} */
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	
}
