package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Cart;
import com.example.demo.entites.Water;
import com.example.demo.responsitory.ICartResponsitory;

@Service
public class CartService {
	@Autowired
	public ICartResponsitory cartResponsitory;
	
	public Cart add(Cart cart) {
		return cartResponsitory.save(cart);
	}
	public List<Cart> list() {
		return cartResponsitory.findAll();
	}
	public void delete(Integer id) {
		cartResponsitory.deleteById(id);;
	}
	public Cart getByWater(Water water) {
		return cartResponsitory.findByWater(water);
	}
}
