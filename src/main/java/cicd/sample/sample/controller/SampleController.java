package cicd.sample.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//added sample file
@RestController(value = "/home")
public class SampleController {

	@GetMapping("/index")
	public String homePage() {
		return "Success";
	}
}
