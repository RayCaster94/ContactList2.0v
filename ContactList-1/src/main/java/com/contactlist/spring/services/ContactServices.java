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
	
	//@PersistenceContext
    //EntityManager entityManager;
	
	
	@Autowired
	private IContactDao contactDao;
	
   
	public Contact addContact(Contact contact) {
		return contactDao.save(contact);
	}
	
	
	@Override
	public List<Contact> list() {

		return contactDao.findAll();
	}


	 @Override
	    public void delete(int id) {
		 Optional<Contact> contact = findById(id);
		 
	        if(contact != null){
	            contactDao.deleteById(id);
	        }

	    }
	    
	 
	  @Override
	  public Optional<Contact> findById(int id) {

	        return contactDao.findById(id);
	    }
	    

	@Override
	public Contact update(Contact contact) {
		return contactDao.save(contact);
	}
	
	@Override
    public Optional<Contact> showContactDetails(int id) { 
        return contactDao.findById(id);
             
    }




	
	
	
	

}
