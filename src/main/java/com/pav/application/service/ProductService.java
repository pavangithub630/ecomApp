package com.pav.application.service;

import java.util.List;

import com.pav.application.dto.ProductDto;
import com.pav.application.entity.Product;

public interface ProductService {
	
	public abstract Product addProduct(ProductDto productDto);
	
	public abstract List<Product> getallProducts();

}
