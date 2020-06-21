package com.example.ThoughtWorks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ThoughtWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThoughtWorksApplication.class, args);
	}

	@RestController
	@CrossOrigin(origins = "http://localhost:1234")
	public class DemoApplication {

		@GetMapping("/user/{id}")
		public String hello(@PathVariable String id) {
			String result = "Hello User " + id;
			return result;
		}
	}

}
