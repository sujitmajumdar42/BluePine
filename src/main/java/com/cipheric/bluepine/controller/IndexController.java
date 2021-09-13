package com.cipheric.bluepine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cipheric.bluepine.utility.ApplicationUtil;

@RestController
@RequestMapping(path = "/")
public class IndexController {
	
	@GetMapping(path = "/api")
	public String index() {
		return "Blue Pine API ["+ApplicationUtil.getCurrentTime()+"]";
	}
}
