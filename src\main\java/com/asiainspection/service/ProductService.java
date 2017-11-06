package com.asiainspection.service;

import java.util.List;

import com.asiainspection.model.Product;

public interface ProductService {
	
	public void add(Product product);
	public void edit(Product product);
	public void delete(int product_id);
	
	public Product getProduct(int product_id);
	public List<Product> getAllProducts();

}
