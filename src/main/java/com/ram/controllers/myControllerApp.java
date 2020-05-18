package com.ram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class myControllerApp {
     @GetMapping("/home")
//    @RequestMapping("/hello")
	public String home() {
		System.out.println("Home Method called");
		return "home ";
	}
}
 