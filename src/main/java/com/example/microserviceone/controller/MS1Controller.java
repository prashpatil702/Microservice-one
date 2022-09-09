package com.example.microserviceone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microserviceone.config.Config;

@RestController
public class MS1Controller {
	
	@Autowired
	private Config config;

	@GetMapping("/endPoint")
	public String getValue()
	{
		System.out.println("Helloooo");
		return config.getValue();
	}
}
