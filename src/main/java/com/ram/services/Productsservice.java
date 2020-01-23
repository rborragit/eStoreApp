package com.ram.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.ran.model.Product;

@Service
public class Productsservice {

	public List<Product> getAllProducts() {
		
		List<Product> listOfProducts = new ArrayList<>();
		
		listOfProducts.add(new Product("123","iPhone X","Apple Product",699.99,"Apple"));
		listOfProducts.add(new Product("124","Note X","Samsung Product",999.99,"Samsung"));
	 	listOfProducts.add(new Product("125","Pixel","Googles Product",599.99,"Google"));
 		
	 	return listOfProducts;
	}
	
	public Product getProductById(String id){
		
		Predicate<Product> byId= p-> p.getId().equals(id);
		return filerProducts(byId);
	}
	
	public Product filerProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}
}
