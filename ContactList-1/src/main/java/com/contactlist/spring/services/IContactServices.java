package com.contactlist.spring.services;

import java.util.List;
import java.util.Optional;

import com.contactlist.spring.model.Contact;

public interface IContactServices {

	public Contact addContact(Contact contact);

	public List<Contact> list();

	public Contact update(Contact contact);

	public Optional<Contact> showContactDetails(int id);

	public void delete(int id);

	public Optional<Contact> findById(int id);

}
