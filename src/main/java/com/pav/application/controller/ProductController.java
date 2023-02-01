package com.pav.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pav.application.dto.ProductDto;
import com.pav.application.entity.Product;
import com.pav.application.service.ProductService;
@RestController
@RequestMapping("product")
public class ProductController {
	
	//adding service dependency
	@Autowired
	ProductService productService;
	
	
	@PostMapping(value = "add-product")
	public Product addProduct(@RequestBody ProductDto product){
		
		//saving the product object
		
		
		return productService.addProduct(product);
	}
	
	@GetMapping(value = "all")
	public List<Product> getallProducts(){
		return productService.getallProducts();
	}


}
