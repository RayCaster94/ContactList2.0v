package com.contactlist.spring.dao;

import java.util.List;

import com.contactlist.spring.model.Contact;

public interface IContactDaoCustom {
	public List<Contact> getFirstNamesLike(String contactName);
}
