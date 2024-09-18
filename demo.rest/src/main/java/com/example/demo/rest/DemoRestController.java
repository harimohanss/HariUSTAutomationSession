package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	public DemoRestController() {
		System.out.println("controller DemoRestController");
	}
	
	@GetMapping("/")//this is called as rest endpoint
	String met() {
		System.out.println("inside met(jjjjjjjjjj)");
		return("Hello World");
	}
	
	@GetMapping("/person")
	User getUser() {
		return new User(1, "some user", "some addr");
	}

}
