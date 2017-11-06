package com.asiainspection.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.asiainspection.model.Product;
import com.asiainspection.service.ProductService;



@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Product product = new Product();
		map.put("product", product);
		map.put("productList", productService.getAllProducts());
		
		
		
		return "product";
	};
	@RequestMapping(value="/product.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Product product, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Product productResult = new Product();
		
		switch (action.toLowerCase()){
			
		case "add":
			productService.add(product);
			productResult = product;
			break;
		case "edit":
			productService.edit(product);
			productResult = product;
			break;
		case "delete":
			productService.delete(product.getProduct_id());
			productResult = new Product();
			break;
		case "search":
			Product searchedProduct = productService.getProduct(product.getProduct_id());
			productResult = searchedProduct != null ? searchedProduct : new Product();
			break;
		
		}
		map.put("product", productResult);
		map.put("productList", productService.getAllProducts());
		return "product";
		
	}
}
