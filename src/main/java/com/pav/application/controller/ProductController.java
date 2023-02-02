package com.pav.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	// adding service dependency
	@Autowired
	ProductService productService;

	@PostMapping(value = "add-product")
	public ResponseEntity<Product> addProduct(@RequestBody ProductDto productDto) {

		// saving the product object

		Product product= productService.addProduct(productDto);
		 return new  ResponseEntity<Product>(product,HttpStatus.OK);
	}

	@GetMapping(value = "all")
	public ResponseEntity<List<Product>> getallProducts() {
		List<Product> products= productService.getallProducts();
		 return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}

}
