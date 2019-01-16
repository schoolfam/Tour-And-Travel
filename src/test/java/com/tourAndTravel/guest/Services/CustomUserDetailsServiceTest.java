package com.tourAndTravel.guest.Services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tourAndTravel.guest.model.CustomUserDetails;
import com.tourAndTravel.guest.model.Users;
import com.tourAndTravel.guest.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class CustomUserDetailsServiceTest {

	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	UserRepository userRepository;
	
	private Users getUser() {
		Users user = new Users();
		user.setFirstName("cnku");
		user.setLastName("ase");
		user.setEmail("cnku@gmail.com");
		user.setUserName("cnku");
		user.setPassword("123456");
		return user;
	}
	
	@Test
	public void testfindUserByUsername() 
	{
        Users user = getUser();
	    
        UserRepository mock = org.mockito.Mockito.mock(UserRepository.class);
	    Mockito.when(mock.findByUserName("cnku")).thenReturn(user);
	    
	    assertThat(customUserDetailsService.findUserByUsername("cnku")).isEqualTo(user);
	}
	
	
	


	@Test
	  public void testloadUserByUsername()
	  {
	    CustomUserDetails user = new CustomUserDetails(getUser());
	    
	    UserRepository mock = org.mockito.Mockito.mock(UserRepository.class);
	    Mockito.when(mock.findByUserName("cnku")).thenReturn(user);
	    
	    assertThat(customUserDetailsService.loadUserByUsername("cnku")).isEqualTo(user);
	  }
}
