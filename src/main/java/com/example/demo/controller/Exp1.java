package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Exp1 {
	@Value("${name}")
	private String name;
	@GetMapping("name")
    public String disp() {
      return ("Hello  !  My name is  " + name);
    }
} 
