package com.pav.application.service;


import java.util.List;

import com.pav.application.entity.Cart;
import com.pav.application.entity.Product;


public interface CartService {
	
	public abstract Cart addcart(Cart cart);
	public abstract Cart addProductsToCart(Product products,long cartId);
	public abstract Cart getCartByCartId(long cartId);
	public abstract List<Product> getProductsInCart(long cartId);
	
	
}
