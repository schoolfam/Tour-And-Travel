package com.tourAndTravel.guest.repository;

import com.tourAndTravel.guest.model.Users;

public interface UserService {

	public Users findByEmailAndPassword(String email,String password);
	
}
