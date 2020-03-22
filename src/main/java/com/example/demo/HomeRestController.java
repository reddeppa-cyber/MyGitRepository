package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@GetMapping("/show")
	public String showMessage() {
		return "WLCOME TO SPRING BOOT";
	}
}
