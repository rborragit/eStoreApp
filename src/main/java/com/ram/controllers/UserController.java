package com.ram.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ran.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/login")
	public String displaylogin(Model model) {
		
		User user = new User();
		model.addAttribute("user", user);
		return "user_login";
	}
	
	@PostMapping("/login")
	public String processlogin(@Valid @ModelAttribute("user") User user,Errors errors) {
		
//		System.out.println("pwd " + user.getPassword());
		if (errors.hasErrors()) {
			return "user_login";
		}
		
		return "home";
	}

}
