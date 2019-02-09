package com.contactlist.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Address implements Serializable {
	
	private static final long serialVersion = 1L;

	private int addressId;
	private String addressName;
	private int postalCode;
	private String town;
	
	//conexiones
	private City City;  //idprovincia
	private List<Contact> Contact;
	private List<Phone> phoneList;
	
	
	
	//GETTERS AND SETTERS
	
		@Id
		@GeneratedValue
		@Column(name = "iddireccion")
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public City getCity() {
		return City;
	}
	public void setCity(City city) {
		City = city;
	}
	public List<Contact> getContact() {
		return Contact;
	}
	public void setContact(List<Contact> contact) {
		Contact = contact;
	} 
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressName=" + addressName + ", postalCode=" + postalCode
				+ ", town=" + town + ", City=" + City + ", Contact=" + Contact + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
