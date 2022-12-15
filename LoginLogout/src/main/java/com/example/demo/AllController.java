package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllController {
	
	
@GetMapping("")
public String viewHomePage() {
		return "index";
	}
		
	
	
}
