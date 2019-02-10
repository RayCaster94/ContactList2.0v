package com.contactlist.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.contactlist.spring.model.Contact;
import com.contactlist.spring.services.ContactServices;


@Controller
public class ContactController {

	@Autowired
	private  ContactServices service;
	
	private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
	
	@GetMapping("/")
	public String handleRequest(ModelMap model) throws Exception {
		logger.info("-- en Listado");		
		model.addAttribute("contact", service.list());
		return "ContactList";
	}	
	
	
}
