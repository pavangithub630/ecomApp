package com.pav.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pav.application.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Long> {

}
