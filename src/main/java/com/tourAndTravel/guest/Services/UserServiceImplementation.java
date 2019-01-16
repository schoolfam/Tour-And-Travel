package com.tourAndTravel.guest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourAndTravel.guest.model.Users;
import com.tourAndTravel.guest.repository.UserRepository;

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
