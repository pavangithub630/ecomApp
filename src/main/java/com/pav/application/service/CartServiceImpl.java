package com.pav.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pav.application.entity.Cart;
import com.pav.application.entity.Product;
import com.pav.application.repository.CartRepository;
import com.pav.application.repository.ProductsRepository;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductsRepository productsRepository;

	@Override
	public Cart addcart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public Cart addProductsToCart(Product products, long cartId) {
		
		Cart cart= cartRepository.findById(cartId).get();
		cart.getProducts().add(products);
		 return cartRepository.save(cart);
		
	}

	@Override
	public Cart getCartByCartId(long cartId) {
		return cartRepository.findById(cartId).get();
	}

	@Override
	public List<Product> getProductsInCart(long cartId) {
		
		
		
		return productsRepository.getProductFromCadrtId(cartId);
	}

}
