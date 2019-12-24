package com.gwanghyeonkim7.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class welcome {
	@GetMapping("/welcome")
	
	public String welcome(Model model) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		model.addAttribute("Key1", list);
		
		Map<String, Object> map = new HashMap<>();
		map.put("a", "value a");
		map.put("b", "value b");
		model.addAttribute("Key2", map);
		
		return "welcome";
			}

}
