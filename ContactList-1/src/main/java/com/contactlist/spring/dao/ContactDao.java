package com.contactlist.spring.dao;



import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




@Repository
@Transactional(readOnly = true)
public class ContactDao implements IContactDaoCustom {
	
	
//CREO QUE ESTA CLASE SOBRA PORQUE EN EL EJERCICIO DEL PROFE ERA DE EJEMPLO, LO DEJO POR SI ACASO PERO POSIBLEMENTE BORRAR EN FUTURO
}

