package com.elvisConsulting.webPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value="/")
	public String home() {		
		return "home";
	}

}
