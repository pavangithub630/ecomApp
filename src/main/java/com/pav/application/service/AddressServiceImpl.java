package com.pav.application.service;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pav.application.dto.AddressDto;
import com.pav.application.entity.Address;
import com.pav.application.repository.AddressRepository;
import com.pav.application.repository.UserRepository;

@Service
public class AddressServiceImpl  implements AddressService{

	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public Address addAddressToTheUser(AddressDto addressDto) {
		
		Address address = modelMapper.map(addressDto, Address.class);
		address.setUser(userRepository.findById(addressDto.getUserId()).get());
		if(userRepository.findById(addressDto.getUserId()).get().getAddresses().size()==0) {
			address.setPrimary(true);
		}
		return addressRepository.save(address);
	}

}
