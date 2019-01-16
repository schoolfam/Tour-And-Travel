package com.tourAndTravel.guest.web;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Controller
public class pageController {

@RequestMapping("/")
public String show() {
	return "Home";
}
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "Dashboard";
	}
}


