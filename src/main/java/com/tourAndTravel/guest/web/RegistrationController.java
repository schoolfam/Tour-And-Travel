package com.tourAndTravel.guest.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tourAndTravel.guest.model.Users;
import com.tourAndTravel.guest.repository.UserRepository;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	UserRepository userRepository;
	
	@Autowired
	  public RegistrationController(UserRepository userRepository) {
	    this.userRepository = userRepository;
	   
	  }

	  @ModelAttribute(name = "user")
	  public Users user() {
	    return new Users();
	  }

	@GetMapping
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		Users user = new Users();
		modelAndView.addObject("user", user); 
		modelAndView.setViewName("Registration"); // resources/template/register.html
		return modelAndView;
	}
	
	@PostMapping
	  public String processDesign(@Valid @ModelAttribute Users user, Errors errors
	     ) {

	    if (errors.hasErrors()) {
	      return "Registration";
	    }

	    userRepository.save(user);
	    

	    return "redirect:/login";
	  }

}
