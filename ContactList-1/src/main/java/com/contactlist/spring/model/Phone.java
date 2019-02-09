package com.contactlist.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "telefono")
public class Phone implements  Serializable {

	private static final long serialVersionUID = 1L;
	
	private int phoneId;
	private int phoneNumber;
	
	//conexiones
	private Contact contact;
	private Address address;
	private City city;
	
	 
	public Phone() {
		
	}

	 @Id
	    @GeneratedValue
	    @Column(name = "idtelefono")
	public int getPhoneId() {
		return phoneId;
	}


	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", contact=" + contact + ", address="
				+ address + ", city=" + city + "]";
	}

  
	
	
}
