package com.ram.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ran.model.Product;

@Repository
public interface ProdutRepo extends CrudRepository<Product, String> {

}
