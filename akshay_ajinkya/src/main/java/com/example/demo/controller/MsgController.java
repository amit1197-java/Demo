package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping
	public String msg() {
	    return "<h1> hello </h1>";
	}

	
}
