package com.tourAndTravel.guest.Services;

import java.util.Arrays;
import java.util.HashSet;

import com.tourAndTravel.guest.model.CustomUserDetails;
import com.tourAndTravel.guest.model.Role;
import com.tourAndTravel.guest.model.Users;
import com.tourAndTravel.guest.repository.RoleRepository;
import com.tourAndTravel.guest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService
{
	private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) 
    {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Users findUserByUsername(String username)
    {
    	return userRepository.findByUserName(username);
    }
    
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		
		Users user = userRepository.findByUserName(username);
		
		     if(user != null) {
			return new CustomUserDetails(user);
		}
		throw new UsernameNotFoundException("User '" + username + "' not found");
	}

}
