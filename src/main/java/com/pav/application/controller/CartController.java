package com.pav.application.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pav.application.entity.Cart;
import com.pav.application.entity.Product;
import com.pav.application.service.CartService;

@RestController
@RequestMapping(value = "cart")
public class CartController {

	@Autowired
	CartService cartService;

	// controller method for adding products to the cart

	@PostMapping(value = "add-products-to-cart/{cartId}")
	public Cart addProductsToCart(@RequestBody Product products, @PathVariable long cartId) {

		return cartService.addProductsToCart(products, cartId);

	}

	// controller method for finding the return the cart by cartId

	@GetMapping(value = "{cartId}")
	public Cart getCartByCartId(@PathVariable long cartId) {

		Cart cart = cartService.getCartByCartId(cartId);

		System.out.println(cart.getCartId() + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiid");

		return cart;

	}
	
	@GetMapping(value = "getproducts/{cartId}")
	public List<Product> getProductsInCart(@PathVariable("cartId") long cartId) {

		System.out.println("got Herreeeeeeee");
		
		List<Product> products = cartService.getProductsInCart(cartId);

	

		return products;

	}

}
