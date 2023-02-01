package com.pav.application.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {

	private Long productId;
	private String brand;
	private String productName;

	private int quantity;

	private int price;

	private int categoryId;

	private Long sellerId;

}
