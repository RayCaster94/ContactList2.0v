package com.contactlist.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactlist.spring.model.Contact;

@Repository
public interface IContactDao extends JpaRepository<Contact, Integer>, IContactDaoCustom {

}
