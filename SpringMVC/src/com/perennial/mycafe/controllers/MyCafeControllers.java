package com.perennial.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	@RequestMapping("/cafe")
	public String showWelcomeMessage(Model model) {
		
		String myName="Sujit";
		model.addAttribute("myNameValue",myName);
		model.addAttribute("myWebsiteTitle","Mom's Cafe");
		return "welcome-page";
	}
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest req,Model model) {
		//handle data received from user
		String userEnteredValue=req.getParameter("foodType");
		//adding captured val to model
		model.addAttribute("userInput",userEnteredValue);
		return "process-order";
	}
}
