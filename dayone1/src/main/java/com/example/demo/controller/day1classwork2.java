package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class day1classwork2 {
	@Value("${var}")
    private String name;
	 @GetMapping("d")
	 public String getName() {
		 return "Welcome "+name+"!";
	 }
}
