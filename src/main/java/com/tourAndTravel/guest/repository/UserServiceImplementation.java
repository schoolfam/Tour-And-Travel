package com.tourAndTravel.guest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourAndTravel.guest.model.Users;

@Service("userService")
@Transactional
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Users findByEmailAndPassword(String email, String password) {
		
		return userRepository.findByEmailAndPassword(email, password);
	}

}
