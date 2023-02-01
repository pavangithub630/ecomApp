package com.pav.application.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pav.application.dto.ProductDto;
import com.pav.application.entity.Product;
import com.pav.application.repository.CategoryRepository;
import com.pav.application.repository.ProductsRepository;
import com.pav.application.repository.SellerRepository;

@Service
public class ProductServiceImpl implements ProductService {

	// adding repository dependency
	@Autowired
	ProductsRepository productsRepository;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	SellerRepository sellerRepository;
	@Autowired
	ModelMapper mapper;

	@Override
	public Product addProduct(ProductDto productDto) {

		Product product = mapper.map(productDto, Product.class);

		product.setCategory(categoryRepository.findById(productDto.getCategoryId()).get());

		product.setSeller(sellerRepository.findById(productDto.getSellerId()).get());

		return productsRepository.save(product);

	}

	@Override
	public List<Product> getallProducts() {
		List<Product> products = productsRepository.findAll();
		
		return products;
	}

}
