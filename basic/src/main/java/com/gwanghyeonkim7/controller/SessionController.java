package com.gwanghyeonkim7.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gwanghyeonkim7.model.User;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginPost(HttpServletRequest request, 
			User user, HttpSession session) {
		session.setAttribute("user", user);
		return "redirect:/main";
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}