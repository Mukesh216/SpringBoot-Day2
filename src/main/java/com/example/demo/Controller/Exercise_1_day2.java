package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_1_day2 {
	@Value("${name}")
	public String name;
	@GetMapping("/")
	public String Name() {
		return "My name is "+name;
	}
}