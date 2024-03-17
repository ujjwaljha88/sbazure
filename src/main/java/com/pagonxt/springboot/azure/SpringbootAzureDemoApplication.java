package com.pagonxt.springboot.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureDemoApplication.class, args);
	}
	@GetMapping("getmessage")
	public String getMessage () {
		return "Congrats! Ujjwal SpringBoot Azure Deployment Success";
	}
	
}
