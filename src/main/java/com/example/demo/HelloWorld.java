package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/Hello")
	public String welcome() {
		
		
		return "Hello, My Name is Divya!!";
		
	}
	

}
