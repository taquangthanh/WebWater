package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Water;
import com.example.demo.responsitory.IWaterResponsitory;
@Service
public class WaterService  {
	@Autowired
	public IWaterResponsitory waterResponsitory;
	
	public Water add(Water water) {
		return waterResponsitory.save(water);
	}
	public Water findById(Integer id) {
		Optional<Water> optional = waterResponsitory.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}
	public Water update(Integer id,Water water) {
		Optional<Water> optional = waterResponsitory.findById(id);
		if(optional.isPresent()) {
			Water w = optional.get();
			if(water.getPhoto()=="") water.setPhoto(w.getPhoto());
			return waterResponsitory.save(water);
		}
			return null;
		}
	public void delete(Integer id) {
		waterResponsitory.deleteById(id);
	}
	public List<Water> getByName(String name) {
		return waterResponsitory.findByNameLike("%" + name + "%");
		
	}
	public Page<Water> getAll(Integer page) {
		return waterResponsitory.findByStatus(0, PageRequest.of(page, 5));
	}
	public List<Water> getAllByName(String name) {
		return waterResponsitory.findAllAndNameLike( 0 , "%" + name + "%");
		
	}
}
