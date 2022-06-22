package com.example.demo.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Order;

@Repository
public interface IOderResponsitory extends JpaRepository<Order, Integer> {

}
