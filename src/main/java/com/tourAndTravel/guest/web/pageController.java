package com.tourAndTravel.guest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
@RequestMapping("/")
public String show() {
	return "Home";
}
}
