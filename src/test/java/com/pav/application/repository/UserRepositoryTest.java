package com.pav.application.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.pav.application.EcomApplication;
import com.pav.application.entity.User;

import jakarta.transaction.Transactional;

@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = EcomApplication.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	private User user;
	
	 @BeforeEach
	public  void userInit() {
		 user = new User();
		user.setAddresses(null);
		user.setAge(20);
		user.setDateOfBirth(LocalDate.now());
		user.setFirstName("pavan");
		user.setLastName("Picheri");
		user.setOrders(null);
		user.setUserName("pavanpp");
	}

	@Test
	public void testNewuser() {
	
		userRepository.save(user);
		User testingUser = userRepository.findByUserName("pavanpp");
		assertEquals(user.getFirstName(), testingUser.getFirstName());
		assertEquals(user.getFirstName(), "pavan");
	}
	
	@Test
	public void testDeleteById() {

		
		userRepository.save(user);
		userRepository.deleteById(user.getUserId());
		List<User> result = new ArrayList<>();
	      assertEquals(result.size(), 0);
	}
	
	@Test
	public void updateByUserName() {

		
		userRepository.save(user);
		User testingUser= userRepository.findByUserName("pavanpp");
		user.setFirstName("Pavan123");
		userRepository.save(testingUser);
		User resultedUser=	userRepository.findByFirstName("Pavan123");
		assertEquals(resultedUser.getUserName(), "pavanpp");
	}

}
