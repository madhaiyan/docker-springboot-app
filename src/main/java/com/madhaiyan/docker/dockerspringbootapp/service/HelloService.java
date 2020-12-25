package com.madhaiyan.docker.dockerspringbootapp.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class HelloService {
	
	@GetMapping
	public String hello() {
		return "Hello Springboot-Docker";
	}
}
