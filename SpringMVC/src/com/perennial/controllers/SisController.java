package com.perennial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String giveMakeup() {
		return "Ok... Here is ur makeup";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks() {
		return "Book:Maths";
	}
	
}
