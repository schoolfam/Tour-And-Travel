package com.tourAndTravel.guest.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Controller
public class pageController {
@PreAuthorize("hasAnyRole('TOURIST')")
@RequestMapping("/")
public String show() {
	return "Home";
}
}
