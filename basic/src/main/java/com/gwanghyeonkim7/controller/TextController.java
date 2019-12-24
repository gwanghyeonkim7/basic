package com.gwanghyeonkim7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
	@GetMapping("/test")
	public String test() {
		return "<h1>Hello~</h1>";
	}
}
