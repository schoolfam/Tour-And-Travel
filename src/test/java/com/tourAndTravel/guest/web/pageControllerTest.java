package com.tourAndTravel.guest.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.tourAndTravel.guest.Services.CustomUserDetailsService;
import com.tourAndTravel.guest.repository.RoleRepository;
import com.tourAndTravel.guest.repository.UserRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(pageController.class)
public class pageControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CustomUserDetailsService customUserDetailsService;
	
	@MockBean
	private UserRepository userRepository;
	
	@MockBean
    private RoleRepository roleRepository;
    
	@MockBean
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Test
	public void testshow() throws Exception 
	{
		mockMvc.perform(get("/"))
	        .andExpect(view().name("Home"));
	 }
	@Test
	public void testdashboard() throws Exception 
	{
		mockMvc.perform(get("/dashboard"))
	        .andExpect(view().name("Dashboard"));
	 }
}
