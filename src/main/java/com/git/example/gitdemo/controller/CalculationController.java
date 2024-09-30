package com.git.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

@RestController
@RequestMapping("/calculate")
public class CalculationController {
	
	
	@PostMapping("/add")
	public int add(@RequestParam int n1, @RequestParam int n2, @RequestParam int n3) {
		return n1+n2+n3;
	}
	
	
	@GetMapping("/staged")
	public String stagged() {
		return "staged";
	}
	
	
	@GetMapping("/workingdirectory")
	public String workingDirectory() {
		System.out.println("added new line in sts");
		System.out.println("added new line in github");
		System.out.println("line 31 conflict");
		System.out.println("Creating conflict once again"); 
		return "workingdirectory Modified in github";
	}

}
