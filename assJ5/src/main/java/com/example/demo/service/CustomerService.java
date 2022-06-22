package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Water;
import com.example.demo.responsitory.ICustomerResponsitory;

@Service
public class CustomerService {
	@Autowired
	private ICustomerResponsitory customerResponsitory;
	 
	public Customer add(Customer customer) {
		return customerResponsitory.save(customer);
	}
	public Customer findByEmail(String email) {
		return customerResponsitory.findByEmail(email);
	}
}
