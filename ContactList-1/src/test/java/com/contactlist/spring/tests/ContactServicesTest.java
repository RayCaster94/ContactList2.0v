package com.contactlist.spring.tests;


import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.contactlist.spring.services.ContactServices;
import com.contactlist.spring.dao.IContactDao;
import com.contactlist.spring.model.Contact;


@RunWith(SpringRunner.class)
//@RunWith(MockitoJUnitRunner.class)
@AutoConfigureMockMvc
class ContactServicesTest {
	
	Logger logger = LoggerFactory.getLogger(ContactServicesTest.class);
	
	@MockBean
	private ContactServices cService; //esta es la que llama al metodo de dao
	
	@MockBean
	private IContactDao cDao; //esta es realmente la que tiene el metodo
	
	@MockBean
	private Contact contact; //esto (cont.)
	
	@Autowired
	private MockMvc mockMvc; //(cont.) y esto no lo entiendo bien
	
	

	@Test
	void testAddContact() {
		logger.info("Primer Test");
		//when(cService.addContact(contact));
		//when then
		
	}

}
