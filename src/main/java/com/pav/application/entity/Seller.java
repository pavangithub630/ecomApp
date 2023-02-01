package com.pav.application.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sellerId;
	private String firstName;
	private String lastName;
	private String userName;
	private int age;
	private LocalDate dateOfBirth;
	
	@OneToMany(mappedBy = "seller",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonManagedReference(value = "products-seller")
	private List<Product> sellerProducts;
	
}
