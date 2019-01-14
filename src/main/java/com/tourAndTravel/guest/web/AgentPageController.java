package com.tourAndTravel.guest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgentPageController {
	@RequestMapping("/Package")
	public String Package() {
	    return "Agent/Package";
	}
	@RequestMapping("/Advertisement")
	public String advert() {
		return "Agent/Advertisement";
	}
	@RequestMapping("/ViewPackage")
	public String ViewPackage() {
		return "Agent/ViewPackage";
	}
	@RequestMapping("/EditPackage")
	public String EditPackage() {
		return "Agent/EditPackage";
	}
}
