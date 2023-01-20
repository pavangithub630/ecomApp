package com.pav.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	private String productName;

	private int quantity;

	private int price;

	@ManyToOne
	@JoinColumn(name = "categoryId", nullable = false)
	private Category category;

	@ManyToOne
	@JoinColumn(name = "sellerId", nullable = false)
	private Seller seller;

	@ManyToOne
	@JoinColumn(name = "cartId", nullable = false)
	private Cart cart;

}
