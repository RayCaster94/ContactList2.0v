package com.contactlist.spring.services;

import java.util.List;
import java.util.Optional;

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
		contactDao.save(contact);
	}
	
	
	@Override
	public List<Contact> list() {

		return contactDao.findAll();
	}
	
	@Override
	public void deleteContact(int id) {
		contactDao.deleteById(id);
	}
	
	@Override
	public Contact showContactDetails(int id) {
		return contactDao.findById(id)
				.orElse(null); //Como es opcional en el metodo del JPARepository, te pide como otra opcion por si no existe/se encuentra
		//SE PODRIA CREAR UNA EXCEPCION PERSONALIZADA
		
	}

}
