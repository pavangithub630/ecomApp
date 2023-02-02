package com.pav.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pav.application.entity.Orders;

import jakarta.persistence.criteria.Order;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
