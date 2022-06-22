package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entites.Cart;
import com.example.demo.entites.Customer;
import com.example.demo.entites.Water;
import com.example.demo.service.CartService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.WaterService;

@Controller
public class CartController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private CartService cartService;
	@Autowired
	private WaterService waterService;
	@Autowired
	private CustomerService customerService;

	@GetMapping("/cart")
	private String showIndex(Model model) {
		List<Cart> carts = cartService.list();
		Integer size = carts.size();
		model.addAttribute("size", size);
		System.out.println(carts);
		model.addAttribute("listcart", carts);
		model.addAttribute("view", "/WEB-INF/views/cart.jsp");
		return "index";
	}
	@GetMapping("/addcart/{id}")
	private String add(@PathVariable Integer id,Cart cart,@RequestParam("quantity") Integer quantity) {
		Water water = waterService.findById(id);
		Customer customer= customerService.findByEmail("thanhtqph17187@fpt.edu.vn");
		System.out.println(water);
		System.out.println(customer);
		cart.setCustomer(customer);
		cart.setPrice(water.getPrice());
		Cart c=cartService.getByWater(water);
		if(c==null) {
			cart.setWater(water);
			cart.setQuantity(quantity);
			cartService.add(cart);
		}else {
			c.setQuantity(quantity+c.getQuantity());
			cartService.add(c);
		}
		return "redirect:/index";
	}
	@GetMapping("/listcart")
	private String showCart(Model model) {
		model.addAttribute("view", "/WEB-INF/views/cart.jsp");
		return "index";
	}
}
