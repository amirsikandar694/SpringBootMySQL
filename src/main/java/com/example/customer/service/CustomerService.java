package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.entity.Customer;
import com.example.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	public Customer createCustomer(Customer customer)
	{
		return repo.save(customer);
	}
	
	
	public List<Customer> getAllCustomer()
	{
		return repo.findAll();
	}
	
	public Optional<Customer> getCustomerById(int id)
	{
		return repo.findById(id);
	}
	
	/*
	 * public List<Customer> getCustomerByName(String name) { return
	 * repo.findByName(name); }
	 */
	
	public String deleteCustomerById(int id)
	{
		repo.deleteById(id);
		return "Customer record deleted successfully with id " +id;
	}
	
	public Customer updateCustomerRecords(Customer customer)
	{
		Customer tempCust=repo.findById(customer.getCustomerId()).orElse(null);
		tempCust.setCustomerFirstName(customer.getCustomerFirstName());
		tempCust.setCustomerLastName(customer.getCustomerLastName());
		tempCust.setCustomerEmail(customer.getCustomerEmail());
		return repo.save(tempCust);
	}

}
