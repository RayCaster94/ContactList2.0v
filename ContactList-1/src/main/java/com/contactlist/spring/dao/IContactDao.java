package com.contactlist.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactlist.spring.model.Contact;

@Repository
public interface IContactDao extends JpaRepository<Contact, Integer>, IContactDaoCustom {



	
}
