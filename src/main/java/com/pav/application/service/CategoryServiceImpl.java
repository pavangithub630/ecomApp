package com.pav.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pav.application.entity.Category;
import com.pav.application.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> addCategoty(List<Category> categories) {
		
		return categoryRepository.saveAll(categories);
		
	}

}
