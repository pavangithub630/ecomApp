package com.pav.application.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pav.application.dto.UserDto;
import com.pav.application.entity.User;
import com.pav.application.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	//adding the user service dependency
	@Autowired
	UserService userService;
	
	// controller method to send the user reponse body to the service
	@PostMapping(value = "add-user")
	public User addUser(@RequestBody UserDto user) {
		
		//passing the request from the client (user object) to the add user method
		
		return userService.addUser(user);
	}
	

}
