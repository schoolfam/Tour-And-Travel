


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller

public class hotelController {

	@RequestMapping("/hotel")
	public String hotel() {
		return "Post Package";
	}
	
}
