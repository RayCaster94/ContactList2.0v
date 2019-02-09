package com.contactlist.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.contactlist.spring.services.ContactServices;

@Controller
public class ContactController {

	@Autowired
	private  ContactServices service;
	
	private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
}
