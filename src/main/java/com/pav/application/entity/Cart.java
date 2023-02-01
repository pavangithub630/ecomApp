package com.pav.application.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartId;

	@OneToOne(mappedBy = "cart")
	@JsonBackReference(value = "user-cart")
	private User user;
	
	@ManyToMany
    @JoinTable(name = "cart_products", joinColumns = @JoinColumn(name = "cart_id", referencedColumnName = "cartId"), inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "productId"))
    private List<Product> products;


}
