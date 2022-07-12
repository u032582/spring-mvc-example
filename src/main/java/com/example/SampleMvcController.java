package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.User;

@Controller
public class SampleMvcController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user")
	private String readForm(@ModelAttribute User user) {
		return "form";
	}

	@PostMapping("/user")
	private String confirm(@ModelAttribute User user) {
		userRepository.save(user);
		return "confirm";
	}
}