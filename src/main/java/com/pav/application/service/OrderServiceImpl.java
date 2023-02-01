package com.pav.application.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.pav.application.entity.Cart;
import com.pav.application.entity.Orders;
import com.pav.application.repository.CartRepository;
import com.pav.application.repository.ProductsRepository;

public class OrderServiceImpl  implements OrderService{

	@Autowired
	ProductsRepository productsRepository;
	@Autowired
	CartRepository cartRepository;
	
	@Override
	public Orders placeOrder(Long cartId) {
		
		Orders orders= new  Orders();
		Cart cart = cartRepository.findById(cartId).get();
		return null;
	}

}
