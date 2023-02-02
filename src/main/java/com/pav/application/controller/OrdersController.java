package com.pav.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pav.application.entity.Orders;
import com.pav.application.service.OrderService;import jakarta.persistence.criteria.Order;

@RestController
@RequestMapping("orders")
public class OrdersController {
	
	@Autowired
	OrderService  orderService;
	
	@PostMapping("place-order/{cartId}")
	public ResponseEntity<Orders>  placeOrder(@PathVariable long cartId) {
		Orders order= orderService.placeOrder(cartId);
		return new ResponseEntity<Orders>(order,HttpStatus.OK);
	}

}
