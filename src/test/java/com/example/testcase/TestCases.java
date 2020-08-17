package com.example.testcase;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.customer.entity.Customer;
import com.example.customer.repository.CustomerRepository;

@SpringBootTest
public class TestCases {
	@Autowired
	CustomerRepository repository;
	
	@Test
	public void testCreateCustomer()
	{
		Customer cust1=new Customer(1001, "Amir", "Sikandar", "amir@gmail.com");
		Customer cust2=new Customer(1002, "Afnan", "Rashid", "afnan@gmail.com");
		Customer cust3=new Customer(1003, "Aashu", "Bhadauriya", "aashu@gmail.com");
		Customer cust4=new Customer(1004, "Rahul", "Sheibe", "rahul@gmail.com");
		
		repository.save(cust1);
		repository.save(cust2);
		repository.save(cust3);
		repository.save(cust4);
	}

}
