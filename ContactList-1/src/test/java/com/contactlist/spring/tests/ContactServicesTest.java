package com.contactlist.spring.tests;


import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.contactlist.spring.services.ContactServices;
import com.contactlist.spring.dao.IContactDao;
import com.contactlist.spring.model.Contact;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

import java.time.LocalDate;

//import javax.inject.Inject;
import org.mockito.InjectMocks;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class ContactServicesTest{
	
	Logger logger = LoggerFactory.getLogger(ContactServicesTest.class);
	
	@MockBean
	private ContactServices contactServices; //esta es la que llama al metodo de dao
	
	@MockBean
	private IContactDao iContactDao; //esta es realmente la que tiene el metodo
	
	@MockBean
	private Contact contact; //esto (cont.)
	
	/*@Autowired
	private MockMvc mockMvc; //(cont.) y esto no lo entiendo bien*/
	
	
	/*@Autowired
	private IContactDao iContactDao;
	
	@Autowired
	private ContactServices contactServices;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private Contact contact;*/	

	@Test
	public void testAddContact() throws Exception {
		//contact = mock(Contact.class);
		//contactServices = mock(ContactServices.class);
		/*int initialSize = iContactDao.findAll().size();
		
		contact.setContactName("Paco");
		contact.setContactLastSurname("Garcia");
		contact.setDni("43534534");
		contact.setContactSurname("Garcia");
		contact.setBirthDate(LocalDate.of(1994, 11, 03));
		contactServices.addContact(contact);
		
		int finalSize = iContactDao.findAll().size();*/
		
		/*try {
			if (finalSize > initialSize) {
				logger.info("No se que estoy haciendo");
			}
		} catch (Exception e) {
			logger.info("A la mierda");
		}*/
		
		/*assertThat(initialSize).isNotEqualTo(finalSize);
		
		iContactDao.delete(contact);*/
		
		/*this.mockMvc
		.perform("/new")*/
		
		assertThat(1).isEqualByComparingTo(2);
		
	}

}