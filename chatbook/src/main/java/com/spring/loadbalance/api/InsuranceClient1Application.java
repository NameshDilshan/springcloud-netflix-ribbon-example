package com.spring.loadbalance.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/chatbook-application")
public class InsuranceClient1Application {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/chat")
	public String chatNow() {
		return "application is up on port : "+ port;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(InsuranceClient1Application.class, args);
	}

}
