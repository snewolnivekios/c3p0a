package com.simplilearn.c3p0a;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C3p0aController {
	@RequestMapping("/")
	public String hello() {
		return "Hello, World!";
	}
}

