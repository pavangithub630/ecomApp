package com.pav.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pav.application.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
