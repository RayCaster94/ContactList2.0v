package com.contactlist.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "telefono")
//@NamedQuery(name="Telefono.findAll", query="SELECT t FROM Telefono t")
public class Phone implements Serializable  {

	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name = "idtelefono")
	private int phoneId;
	    @Column(name = "telefono")
	private String phoneNumber;
	
	
	
	//bi-directional many-to-one association to Persona
		@ManyToOne
		@JoinColumn(name="idpersona")
	private Contact contact;
	
	public Phone() {
		
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	
	@Override
	public String toString() {
		return "Phone [phoneNumber]";
	}
	
	




	
	
}
