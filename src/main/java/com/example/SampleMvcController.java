package com.example;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.User;

@Controller
public class SampleMvcController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user")
	private String readForm(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("users", userRepository.findAll());
		return "form";
	}

	@Transactional
	@PostMapping("/user")
	private String confirm(@ModelAttribute User user) {
		userRepository.save(user);
		return "confirm";
	}
}