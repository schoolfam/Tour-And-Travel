package _hotel;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/hotel")
public class hotelController {

	@GetMapping()
	public String hotel() {
		return "hotel";
	}
	
}
