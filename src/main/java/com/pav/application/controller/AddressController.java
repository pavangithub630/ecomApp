package com.pav.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pav.application.dto.AddressDto;
import com.pav.application.entity.Address;
import com.pav.application.service.AddressService;

@RestController
@RequestMapping(value = "address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	@PostMapping
	public Address addAddressToTheUser(@RequestBody AddressDto addressDto) {
		return addressService.addAddressToTheUser(addressDto);
	}

}
