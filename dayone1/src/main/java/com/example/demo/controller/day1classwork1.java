package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class day1classwork1 {
	@GetMapping("disp")
	public String Welcome() {
  	  return "Welcome String boot!";
    }
}
