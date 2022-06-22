package com.example.demo.service;

import java.util.List;import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Order;
import com.example.demo.entites.OrderDetail;
import com.example.demo.responsitory.IOrderDetailResponsitory;

@Service
public class OrderDetailService {
	
	@Autowired
	public IOrderDetailResponsitory orderDetailResponsitory;
	
	public OrderDetail add(OrderDetail orderDetail) {
		return orderDetailResponsitory.save(orderDetail);
	}
	public List<OrderDetail> listOrderDetail(Order order){
		return orderDetailResponsitory.findByOrder(order);
	}
}
