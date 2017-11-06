package com.asiainspection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int product_id;
	@Column
	private String product_name;
	@Column
	private String product_description;
	@Column
	private double product_price;
	@Column
	private String product_category;
	@Column
	private int product_available;
	
	public Product(){}
	
	public Product(int product_id, String product_name, String product_description, double product_price,
			String product_category, int product_available) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_price = product_price;
		this.product_category = product_category;
		this.product_available = product_available;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public int getProduct_available() {
		return product_available;
	}
	public void setProduct_available(int product_available) {
		this.product_available = product_available;
	}
	
	

}
