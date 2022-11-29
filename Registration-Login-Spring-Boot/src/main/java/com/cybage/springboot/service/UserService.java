package com.cybage.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.cybage.springboot.controller.dto.UserRegistrationDto;
import com.cybage.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
