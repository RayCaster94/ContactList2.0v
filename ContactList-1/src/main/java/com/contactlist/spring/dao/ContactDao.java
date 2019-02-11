package com.contactlist.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.contactlist.spring.model.Contact;


@Repository
@Transactional(readOnly = true)
public class ContactDao implements IContactDaoCustom {
	
	 @PersistenceContext
	    EntityManager entityManager;
	 
	 //Para entender un ejemplo de como se pueden hacer funciones personalizadas
	public List<Contact> getFirstNamesLike(String contactName) {
		Query query = entityManager.createNativeQuery("SELECT * FROM persona " +
             "WHERE persona.nombre LIKE ?", Contact.class);
     query.setParameter(1, contactName + "%");
     return query.getResultList();
//CREO QUE ESTA CLASE SOBRA PORQUE EN EL EJERCICIO DEL PROFE ERA DE EJEMPLO, LO DEJO POR SI ACASO PERO POSIBLEMENTE BORRAR EN FUTURO
}
}
