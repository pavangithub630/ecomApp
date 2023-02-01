package com.pav.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressDto {
	
	
	private Long id; 
	private String street;
	private String city;
	private String state;
	private String zipCode;
	private long userId;

}
