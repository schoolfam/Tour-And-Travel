package _hotel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@Controller

public class PostPackageController {
	@RequestMapping("/Post Package")
	public String hotel() {
		return "Post package";
	}
	
}
