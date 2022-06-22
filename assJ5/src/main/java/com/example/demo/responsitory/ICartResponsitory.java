package com.example.demo.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Cart;
import com.example.demo.entites.Water;

@Repository
public interface ICartResponsitory extends JpaRepository<Cart, Integer> {
	@Query("select o from Cart o where o.water=?1")
	Cart findByWater(Water water);
}
