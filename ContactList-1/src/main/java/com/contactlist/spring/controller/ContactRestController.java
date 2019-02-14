package com.contactlist.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.contactlist.spring.model.Contact;
import com.contactlist.spring.services.ContactServices;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/contact"})
public class ContactRestController {

	@Autowired
	private ContactServices service;
	
	//NEW
	@PostMapping
	public Contact create(@RequestBody Contact contact) {
		return service.addContact(contact);	
	}
    
	//DELETE
    @DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("contactId") int id) {
		service.delete(id);	
	}
	
    
    //LIST
    @GetMapping
    public List<Contact> findAll(){
        return service.list();
    }
    
    //EDIT
    @PutMapping(path = {"/{id}"})
    public Contact update(@PathVariable("contactId") int id, @RequestBody Contact contact){
        contact.setContactId(id);
        return service.update(contact);
    }
    
    //SHOWDETAILS
    
    @GetMapping(path = {"/{id}"})
    public Optional<Contact> findOne(@PathVariable("contactId") int id){
        return service.findById(id);
    }
    
}
