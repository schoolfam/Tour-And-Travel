package com.tourAndTravel.guest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourAndTravel.guest.model.Users;

public interface UserRepository extends JpaRepository<Users,Long> {
	
	public Users findByEmailAndPassword(String email,String password);

}
