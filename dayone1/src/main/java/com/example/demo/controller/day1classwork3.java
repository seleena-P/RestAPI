package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class day1classwork3 {
	@Value("${v}")
    private String name;
	 @GetMapping("dd")
	 public String getMyFav() {
		 return "My Favourite Colour is "+name;
	 }
}
