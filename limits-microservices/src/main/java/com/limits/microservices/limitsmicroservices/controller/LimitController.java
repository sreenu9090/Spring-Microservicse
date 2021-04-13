package com.limits.microservices.limitsmicroservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limits.microservices.limitsmicroservices.bean.LimitConfiguration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitsData(){
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
