package com.pav.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pav.application.dto.UserDto;
import com.pav.application.entity.Category;
import com.pav.application.entity.User;
import com.pav.application.service.CategoryService;

@RestController
@RequestMapping(value = "category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	@PostMapping(value = "add-categories")
	public List<Category> addCategory(@RequestBody List<Category> categories){
		
		//passing the list of categories to save in the database
		
		return categoryService.addCategoty(categories);
	}

}
