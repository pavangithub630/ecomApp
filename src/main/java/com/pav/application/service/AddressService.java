package com.pav.application.service;

import com.pav.application.dto.AddressDto;
import com.pav.application.entity.Address;

public interface AddressService {
	
	public abstract Address addAddressToTheUser(AddressDto addressDto);

}
