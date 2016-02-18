package com.sanchit.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class angularSpringApplication {
	private static final Logger log = LoggerFactory.getLogger(angularSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(angularSpringApplication.class, args);
	}
	
	@RequestMapping("/resource")
	public Map<String, Object> home(){
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello Sanchit Agarwal");
		return model;
	}
}
