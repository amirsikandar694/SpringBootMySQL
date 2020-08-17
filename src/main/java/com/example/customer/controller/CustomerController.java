package com.example.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.entity.Customer;
import com.example.customer.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;

	@GetMapping("/customers/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id) {
		return service.getCustomerById(id);
	}

	@GetMapping("/customers")
	public List<Customer> getAllCustomer() {
		return service.getAllCustomer();
	}

	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer cust) {
		return service.createCustomer(cust);
	}

	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@RequestBody Customer cust) {
		return service.updateCustomerRecords(cust);
	}

	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return service.deleteCustomerById(id);
	}
}
