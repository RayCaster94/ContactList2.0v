package com.contactlist.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.contactlist.spring.model.Contact;
import com.contactlist.spring.dao.IContactDao;

@Service
@Transactional
public class ContactServices implements IContactServices {
	
	@Autowired
	private IContactDao contactDao;

	public void addContact(Contact contact) {
		//contactDao.save(contact);
	}
}
