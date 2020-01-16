package com.ram.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ran.model.Product;

@Controller
@RequestMapping("/products")
public class ProductController {
    
	@GetMapping("/all")
	public String getAllProducts(Model model) {
	   
		ArrayList<Product> listOfProducts = new ArrayList<>();
		
		listOfProducts.add(new Product("123","iPhone X","This Apples Product",699.99,"Apple"));
		listOfProducts.add(new Product("124","Note X","This Samsung Product",999.99,"Samsung"));
	 	listOfProducts.add(new Product("125","Pixel","This Googles Product",599.99,"Google"));
 		
		model.addAttribute("products",listOfProducts);
		return "product_all";
	} 
	
}
