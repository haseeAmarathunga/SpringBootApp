package com.trasher.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	@GetMapping("/")
	public String hellow() {
		return "Hellow World";
	}
}

