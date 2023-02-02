package com.pav.application.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pav.application.entity.Cart;
import com.pav.application.entity.Orders;
import com.pav.application.entity.Product;
import com.pav.application.entity.User;
import com.pav.application.repository.CartRepository;
import com.pav.application.repository.OrdersRepository;
import com.pav.application.repository.ProductsRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	CartRepository cartRepository;
	@Autowired
	OrdersRepository ordersRepository;
	@Autowired
	ModelMapper mapper;

	@Override
	public Orders placeOrder(Long cartId) {

		Orders order = new Orders();
		System.out.println("e1111111111111111111111111111111111111111111");
		Cart cart = cartRepository.findById(cartId).get();
		System.out.println("e1111111111111111111111111111111111111111111");
		List<Product> productcs = new ArrayList<>();
		productcs.addAll(cart.getProducts());
		order.setProducts(productcs);
		System.out.println("e1111111111111111111111111111111111111145345345");
		User user = cart.getUser();
		order.setUser(user);
		cart.getProducts().clear();
		;
		System.out.println("e111111111111111111111111111111111111114534534567");
		return ordersRepository.save(order);
	}

}
