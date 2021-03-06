package com.asiainspection.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.asiainspection.dao.ProductDAO;
import com.asiainspection.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Product product) {
		session.getCurrentSession().save(product);

	}

	@Override
	public void edit(Product product) {
		session.getCurrentSession().update(product);

	}

	@Override
	public void delete(int product_id) {
		session.getCurrentSession().delete(getProduct(product_id));

	}

	@Override
	public Product getProduct(int product_id) {
		
		return (Product) session.getCurrentSession().get(Product.class, product_id);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return session.getCurrentSession().createQuery("from product").list();
	}

}
