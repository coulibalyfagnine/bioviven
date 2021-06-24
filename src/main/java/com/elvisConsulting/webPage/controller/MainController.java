package com.elvisConsulting.webPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/")
	public String accueil() {		
		return "accueil";
	}
	
	@RequestMapping(value="/produitsEtServices")
	public String produitEtServices() {		
		return "produitsEtServices";
	}
	
	@RequestMapping(value="/aProposDeNous")
	public String aProposDeNous() {		
		return "aProposDeNous";
	}

}
