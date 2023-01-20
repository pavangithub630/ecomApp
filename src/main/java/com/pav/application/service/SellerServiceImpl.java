package com.pav.application.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pav.application.dto.SellerDto;
import com.pav.application.entity.Seller;
import com.pav.application.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService{

	// autowiring required dependencies
	
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	SellerRepository sellerRepository;
	
	@Override
	public Seller addSeller(SellerDto sellerDto) {
		
	
		
			//mapping the sellerDto to seller class
			Seller seller = modelMapper.map(sellerDto,Seller.class);
			seller.setSellerProducts(null);
			
			// saving and returning the seller object
			return sellerRepository.save(seller);
	}

}
