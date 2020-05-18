package com.ram.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ran.model.Product;

@Service
public class Productsservice {

	@Autowired
	private ProdutRepo productrepo;
	
	public List<Product> getAllProducts() {
		
		List<Product> listOfProducts = new ArrayList<>();
		
//		listOfProducts.add(new Product("123","iPhone X","Apple Product",699.99,"Apple"));
//		listOfProducts.add(new Product("124","Note X","Samsung Product",999.99,"Samsung"));
//	 	listOfProducts.add(new Product("125","Pixel","Googles Product",599.99,"Google"));
	 	
		productrepo.findAll().forEach(listOfProducts::add);
//  	System.out.println(listOfProducts.get(0).getDescription());
	 	return listOfProducts;
	}
	
	public Product getProductById(String id){
		
		Predicate<Product> byId= p-> p.getId().equals(id);
		return filerProducts(byId);
	}
	
	public Product filerProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}
	
	public Product addProductDB (Product product) {
		
		product = productrepo.save(product);
		
		return product;
	}
}
