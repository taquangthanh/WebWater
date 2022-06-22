package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Order;
import com.example.demo.responsitory.IOderResponsitory;

@Service
public class OrderService {

	@Autowired
	public IOderResponsitory oderResponsitory;
	
	public Order add(Order order) {
		return oderResponsitory.save(order);
	}
	public List<Order> list(){
		return oderResponsitory.findAll();
	}
	public Order getId(Integer id) {
		Optional<Order> optional = oderResponsitory.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null ;
		}	
	}
}
