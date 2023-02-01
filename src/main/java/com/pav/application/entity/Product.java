package com.pav.application.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
	private String brand;
	private int quantity;
	private int price;

	@ManyToOne
	@JoinColumn(name = "categoryId", nullable = false)
	@JsonBackReference(value = "produts-category")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "sellerId", nullable = false)
	@JsonBackReference(value = "products-seller")
	private Seller seller;
	 

}
