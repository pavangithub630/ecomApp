package com.pav.application.service;

import com.pav.application.dto.UserDto;
import com.pav.application.entity.User;

public interface UserService {
	
	
	public abstract User addUser(UserDto user);

}
