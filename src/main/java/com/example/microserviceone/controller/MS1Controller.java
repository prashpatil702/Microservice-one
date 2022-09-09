package com.example.microserviceone.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.microserviceone.config.Config;

@RestController
public class MS1Controller {
	
	@Autowired
	private Config config;
	
	@Autowired
	private HttpServletRequest request;

	@GetMapping("/endPoint")
	public String getValue()
	{
		return config.getValue();
	}
	
	@GetMapping("/getMessageFromMS1")
	public String getMessage()
	{
		String token = request.getHeader("X-Auth-Code");
		//return "Start";
		return "Start"+" "+token;
	}
	
}
