package com.ram.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ram.services.Productsservice;
import com.ran.model.Product;


@Controller
@RequestMapping("/products")
public class ProductController {
   
	@Autowired
	private Productsservice productsservice;
	
	@GetMapping("/all")
	public String getAllProducts(Model model) {
	   
		 		
		model.addAttribute("products",productsservice.getAllProducts());
		return "product_all";
	} 
	
	@GetMapping("/{productId}")
	public String getProductById(Model model,@PathVariable("productId") String productId) {
		
		model.addAttribute("product",productsservice.getProductById(productId));
		return "product";
	}
}
