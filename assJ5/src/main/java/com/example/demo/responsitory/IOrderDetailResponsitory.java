package com.example.demo.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Order;
import com.example.demo.entites.OrderDetail;
import com.example.demo.entites.Water;

@Repository
public interface IOrderDetailResponsitory extends JpaRepository<OrderDetail, Integer> {
	List<OrderDetail> findByOrder(Order order);
}
