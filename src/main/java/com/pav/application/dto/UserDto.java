package com.pav.application.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

	private String firstName;
	private String lastName;
	private String userName;
	private int age;
	private LocalDate dateOfBirth;

}
