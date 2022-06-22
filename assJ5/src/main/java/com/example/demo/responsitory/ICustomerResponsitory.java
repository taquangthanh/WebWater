package com.example.demo.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Cart;
import com.example.demo.entites.Customer;

@Repository
public interface ICustomerResponsitory extends JpaRepository<Customer, Integer> {

	@Query("select o from Customer o where o.email = :email")
    public Customer findByEmail(@Param("email") String email);
}
