package com.git.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitdemoController {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello Dear";
	}

}
