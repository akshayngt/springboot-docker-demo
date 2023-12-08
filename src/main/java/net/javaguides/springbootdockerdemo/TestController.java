package net.javaguides.springbootdockerdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Spring Boot Docker Demo";
	}
}
