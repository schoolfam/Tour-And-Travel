package com.tourAndTravel.guest.web;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tourAndTravel.guest.model.Users;
import com.tourAndTravel.guest.repository.UserRepository;
import com.tourAndTravel.guest.repository.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;

//	
//	@ModelAttribute(name = "user")
//	  public Users user() {
//	    return new Users();
//	  }
//	
	@GetMapping
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		Users user = new Users();
		modelAndView.addObject("user", user); 
		modelAndView.setViewName("Login"); // resources/template/register.html
		return modelAndView;
	}
	
	@PostMapping
	public String processDesign(@Valid @ModelAttribute(name="user") Users user, Errors errors,Model modelMap) 
	{

		String result="";
		try {
	    List<Users> AllUsers=  userRepository.findAll().stream()
	    		.filter(x -> x.getEmail().equals(user.getEmail()))
	    		.collect(Collectors.toList());
	    
	    for(Users users:AllUsers) {
	    	
	    	if(user.getEmail().equals(users.getEmail()) && user.getPassword().equals(users.getPassword())) 
		    {
		    	System.out.println(users.getFirstName().toString());
		    	System.out.println(users.getLastName().toString());
		    	System.out.println(users.getEmail().toString());
		    	System.out.println(users.getPassword().toString());
		    	System.out.println(users.getRole_id());
		    	modelMap.addAttribute(users);
		    	if(users.getRole_id()==0) {
		    	result= "Dashboard";
		    	}
		    	else if(users.getRole_id()==1) {
			    	result= "AgentDashboard";}
		    	else {
			    	result= "HotelDashboard";}
		    }
		    else {
		    	modelMap.addAttribute("error", "Invalid User");
		        result = "Login";
		    }
	    	
	    }
	   
	    }
		catch (Exception e) {
			System.out.println("No User Found");
			result = "Login";
		}
	    
		 return result; 

	
	  }
         
	
}
