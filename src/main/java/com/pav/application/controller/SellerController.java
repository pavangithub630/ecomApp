package com.pav.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pav.application.dto.SellerDto;
import com.pav.application.entity.Seller;
import com.pav.application.repository.SellerRepository;
import com.pav.application.service.SellerService;

@RestController
@RequestMapping("seller")
public class SellerController {
	
	//Autowiring the required dependencies
	@Autowired
	SellerService sellerService;
	

	// controller method for creating seller 
	@PostMapping("add-seller")
	public Seller createSeller(@RequestBody SellerDto sellerDto) {
		
		 return sellerService.addSeller(sellerDto);
		
	}
}
