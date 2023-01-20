package com.pav.application.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pav.application.dto.UserDto;
import com.pav.application.entity.Cart;
import com.pav.application.entity.User;
import com.pav.application.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	// injecting the user repository to work with user table

	@Autowired
	UserRepository userRepository;
	@Autowired
	ModelMapper modelMapper;

	// service to save user in the db

	@Override
	public User addUser(UserDto userDto) {

		// saving user in the db and returning the user

		User user = modelMapper.map(userDto, User.class);

		Cart cart = new Cart();
		cart.setCartId(0);
		cart.setCartProducts(null);
		cart.setUser(user);

		user.setCart(cart);

		return userRepository.save(user);
	}

}
