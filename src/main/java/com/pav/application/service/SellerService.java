package com.pav.application.service;

import com.pav.application.dto.SellerDto;
import com.pav.application.entity.Seller;

public interface SellerService {
	
	
	public abstract Seller addSeller(SellerDto sellerDto);

}
