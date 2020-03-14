package com.exam.deploy.DeploytoAWS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hi")
	public String sayHello() {
		return "How r u...............";
	}
}
