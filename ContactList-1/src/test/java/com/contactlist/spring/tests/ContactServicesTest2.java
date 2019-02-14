package com.contactlist.spring.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.contactlist.spring.dao.IContactDao;
import com.contactlist.spring.model.Contact;
import com.contactlist.spring.services.ContactServices;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactServicesTest2 {
	
	Logger logger = LoggerFactory.getLogger(ContactServicesTest2.class);
	
	@Autowired
	private ContactServices contactServices; 
	
	@Autowired
	private IContactDao iContactDao; 	
	
	private Contact contact; 
	
	int initialSize;
	int finalSize;
	
	@Before
	public void instantiateContact() {
		contact = new Contact(); //Es para instanciar el objeto antes de cada test
	}
	
    //PRUEBA LAURA
	@Test
	public void testAddContactSize() throws Exception {
		initialSize = contactServices.list().size(); //para pillar el tamanyo de la lista ANTES de agregar al contacto	
		
		logger.info("Creamos al contacto");
		contact.setContactName("Paco");
		contact.setContactLastSurname("Garcia");
		contact.setDni("43534534");
		contact.setContactSurname("Garcia");
		contact.setBirthDate(Date.valueOf("1976-5-3"));		
		
		logger.info("Agregamos al contacto");
		contactServices.addContact(contact);
		
		finalSize = contactServices.list().size(); //para pillar el tamanyo de la lista DESPUES de agregar al contacto
		
		logger.info("Comparamos el tamanyo de la lista antes y despues");
		assertThat(initialSize).isNotEqualTo(finalSize); //comprobamos si son iguales
		//Se podria hacer otra de que sea menor el initial y mayor el otro, etc.n			
	}
	
	private Date Date(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Ignore //es que aun no esta acabado, quiero que compare nombres
	@Test
	public void testAddContactString() throws Exception {
		contact.setContactName("Carlos");
		contact.setContactLastSurname("Amor");
		contact.setContactSurname("Mio");
		contact.setDni("43534534");
		contact.setBirthDate(Date.valueOf("2018-5-18"));	
		
		
		contactServices.addContact(contact);	
		
		//assertThat().isEqualTo("Carlos");
		
		iContactDao.delete(contact);
	}
	
	@After
	public void deleteContact() {
		iContactDao.delete(contact); //lo borramos cada vez que realiza un test para no dejar rastro y que ensucie los demas
	}
	
	//PRUEBA ATENEA
	@Test
    //añado un contacto
    public void testAddContactSize2() throws Exception {
        initialSize = contactServices.list().size(); //para pillar el tamanyo de la lista ANTES de agregar al contacto    
        
        logger.info("Creamos al contacto para prueba unitaria");
        contact.setContactName("Laura");
        contact.setContactLastSurname("Hater");
        contact.setDni("43534534");
        contact.setContactSurname("Garcia");
        contact.setBirthDate(Date.valueOf("1991-08-05"));
        contact.setContactId(100000);
        
        logger.info("Agregamos al contacto para prueba unitaria");
        contactServices.addContact(contact);
        
        finalSize = contactServices.list().size(); //para pillar el tamanyo de la lista DESPUES de agregar al contacto
        
        logger.info("Comparamos el tamanyo de la lista antes y despues");
        assertThat(initialSize).isNotEqualTo(finalSize); //comprobamos si son iguales
        //Se podria hacer otra de que sea menor el initial y mayor el otro, etc.    
    }
    //borro contacto y compruebo que está borrado
    public void testDeleteMethod() throws Exception {     
        iContactDao.deleteById(1);
        assertNull(iContactDao.existsById(100000));
        logger.info("Venga,primix");
    }
	
	

}
