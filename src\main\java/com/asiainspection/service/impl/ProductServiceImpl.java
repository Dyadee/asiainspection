package com.asiainspection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainspection.dao.ProductDAO;
import com.asiainspection.model.Product;
import com.asiainspection.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Transactional
	public void add(Product product) {
		productDAO.add(product);

	}

	@Transactional
	public void edit(Product product) {
		productDAO.edit(product);

	}

	@Transactional
	public void delete(int product_id) {
		productDAO.delete(product_id);

	}

	@Transactional
	public Product getProduct(int product_id) {
		
		return productDAO.getProduct(product_id);
	}

	@Transactional
	public List<Product> getAllProducts() {
		
		return productDAO.getAllProducts();
	}

}
