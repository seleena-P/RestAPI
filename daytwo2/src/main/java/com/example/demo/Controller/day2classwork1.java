package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class day2classwork1 {
	@Value("${var}")
    private String name;
	 @GetMapping("display")
	 public String getName() {
		 return name;
	 }
}
