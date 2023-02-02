package com.pav.application.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pav.application.entity.Cart;
import com.pav.application.entity.Category;
import com.pav.application.repository.CategoryRepository;
import com.pav.application.service.CategoryService;

@RestController
@RequestMapping(value = "category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	CategoryRepository categoryRepository;

	@PostMapping(value = "add-categories")
	public ResponseEntity<List<Category>> addCategory(@RequestBody List<Category> categories) {

		// passing the list of categories to save in the database

		List<Category> categories2= categoryService.addCategoty(categories);
		return new ResponseEntity<List<Category>>(categories2,HttpStatus.OK);
	}
//	
//	@PostMapping(value = "image")
//	public Category setImageToCategory(@RequestParam("imageFile") MultipartFile image)throws IOException {
//		
//		Category category = categoryRepository.findById(2).get();
//		category.setCategoryImage(compressBytes(image.getBytes()));
//		return category;
//		
//	}



	

}
