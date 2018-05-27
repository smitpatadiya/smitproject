package com.spring.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmitController {
	
	@RequestMapping("/")
	public String hellp() {
		return "This is smit";
	}
	

}
