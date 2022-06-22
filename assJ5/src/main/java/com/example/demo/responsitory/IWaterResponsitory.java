package com.example.demo.responsitory;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Customer;
import com.example.demo.entites.Water;
import com.example.demo.entites.WaterType;

@Repository
public interface IWaterResponsitory extends JpaRepository<Water, Integer> {
	List<Water> findByType(WaterType type);
	@Query("SELECT c FROM Water c WHERE c.name like ?1")
	List<Water> findByNameLike(String name);
	@Query("SELECT c FROM Water c WHERE c.name like ?1 and c.type=?2")
	List<Water> findByNameLikeAndType(String name,WaterType type);
	
	@Query("SELECT c FROM Water c WHERE c.status = ?1")
	Page<Water> findByStatus(Integer status,Pageable pageable);
	
	@Query("SELECT c FROM Water c WHERE c.status = ?1 and c.name like ?2")
	List<Water> findAllAndNameLike(Integer status,String name);
}
