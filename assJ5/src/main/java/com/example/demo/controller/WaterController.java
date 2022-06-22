package com.example.demo.controller;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entites.Cart;
import com.example.demo.entites.Water;
import com.example.demo.entites.WaterType;
import com.example.demo.responsitory.IWaterResponsitory;
import com.example.demo.service.CartService;
import com.example.demo.service.WaterService;

@Controller
public class WaterController {
	@Autowired
	private IWaterResponsitory waterResponsitory;
	
	@Autowired
	private WaterService waterService;
	@Autowired
	private CartService cartService;

	@GetMapping("/index")
	private String showIndex(Model model,@RequestParam(name = "name", defaultValue = "") String name) {
		List<Cart> carts = cartService.list();
		Integer size = carts.size();
		model.addAttribute("size", size);
		List<Water> waters = waterService.getAllByName(name);
		model.addAttribute("listwater", waters);
		model.addAttribute("view", "/WEB-INF/views/listwater.jsp");
		System.out.println(waters);
		return "index";
	}

	@GetMapping("/allwater")
	private String showAllWater(Model model,@RequestParam(name = "page",defaultValue = "0") Integer page) {
		List<Cart> carts = cartService.list();
		Integer size = carts.size();
		model.addAttribute("size", size);
		Page<Water> waters = waterService.getAll(page);
		model.addAttribute("listwater", waters.getContent());
		model.addAttribute("currentPage", waters.getNumber());
		model.addAttribute("maxPage", waters.getTotalPages());
		model.addAttribute("view", "/WEB-INF/views/allwater.jsp");
		return "index";
	}

	@GetMapping("/water/add")
	private String addWater(Model model, Water water) {
		WaterType[] waterType = WaterType.values();
		model.addAttribute("type", waterType);
		model.addAttribute("view", "/WEB-INF/views/addwater.jsp");
		return "index";
	}
	@PostMapping("/water/new")
	private String newWater(Water water) {
		water.setStatus(0);
		water.setCreatedDate();
		waterService.add(water);
		return "redirect:/allwater";
	}
	@GetMapping("/water/edit")
	private String editProduct(@RequestParam(name = "id") Integer id,Model model) {
		WaterType[] types = WaterType.values();
		Water w = waterService.findById(id);
		model.addAttribute("water", w);
		model.addAttribute("type", types);
		model.addAttribute("view","/WEB-INF/views/updatewater.jsp");
		return "index";
	}
	@PostMapping("/water/update")
	private String updateWater(@RequestParam(name = "id") Integer id,Water water) {
		water.setCreatedDate();
		water.setStatus(0);
		water=waterService.update(id, water);
		return "redirect:/allwater";
	}
	@GetMapping("/water/delete")
	public String delete(@RequestParam(name = "id") Integer id) {
		Water waters = waterService.findById(id);
		waters.setStatus(1);
		waterService.update(id, waters);
		return "redirect:/allwater";
	}
	@GetMapping("/detail/{id}")
	private String detail(Model model,@PathVariable("id") Integer id) {
		List<Cart> carts = cartService.list();
		Integer size = carts.size();
		model.addAttribute("size", size);
		Water waters = waterService.findById(id);
		List<Water> w = waterResponsitory.findAll();
		model.addAttribute("listwater", w);
		model.addAttribute("water", waters);
		model.addAttribute("view", "/WEB-INF/views/detail.jsp");
		return "index";
	}
}
