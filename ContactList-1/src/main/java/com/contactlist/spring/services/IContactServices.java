package com.contactlist.spring.services;

import java.util.List;

import com.contactlist.spring.model.Contact;


public interface IContactServices {
	
	public void addContact(Contact contact);

	public List<Contact> list();
}
