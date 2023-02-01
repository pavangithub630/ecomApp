package com.pav.application.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;

	@ManyToOne
	@JoinColumn(name = "userId", nullable = false)
	@JsonBackReference(value = "user-orders")
	private User user;
	
	
	
	
	
	

}
