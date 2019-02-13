package com.contactlist.spring.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.contactlist.spring.model.Contact;
import com.contactlist.spring.dao.IContactDao;


@Service
@Transactional
public class ContactServices implements IContactServices {
	
	@PersistenceContext
    EntityManager entityManager;
	
	
	@Autowired
	private IContactDao contactDao;
	
   
	public void addContact(Contact contact) {
		contactDao.save(contact);
	}
	
	
	@Override
	public List<Contact> list() {

		return contactDao.findAll();
	}


	public void delete(int id) {
		contactDao.deleteById(id);
		
	}


	@Override
	public Contact get(int id) {
		return contactDao.getOne(id);
	}

	@Override
	public void update(Contact contact) {
		contactDao.save(contact);
	}


	
	
	
	

}
