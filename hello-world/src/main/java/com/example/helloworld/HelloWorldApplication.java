package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class HelloWorldApplication {

	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}

}
