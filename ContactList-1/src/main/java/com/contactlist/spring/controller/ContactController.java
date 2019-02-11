package com.contactlist.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		model.addAttribute("contactList", service.list());
		return "ContactList";
	}	
	
	@GetMapping("/new")
	public String newUser(ModelMap model) {
		logger.info("-- en NEW");
		model.addAttribute("contact", new Contact());
		return "ContactForm";		
	}
	
	@PostMapping("/save")
	public ModelAndView saveContact(@ModelAttribute Contact contact) {
		logger.info("-- en SAVE");
		service.addContact(contact);
		return new ModelAndView("redirect:/");
	}
	
	
}
