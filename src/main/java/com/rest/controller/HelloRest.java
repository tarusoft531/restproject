package com.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Welcome to rest";
	}
}
