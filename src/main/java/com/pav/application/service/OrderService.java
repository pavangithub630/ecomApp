package com.pav.application.service;

import com.pav.application.entity.Orders;

public interface OrderService  {
	
	public abstract Orders placeOrder(Long cartIdLong);

}
