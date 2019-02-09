package com.contactlist.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class City implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cityId;
	private String cityName;
	
	//conexiones 
	private List<Contact> Contact;
	private List<Phone> phoneList;
	private List<Address> Address;
	
	public City() {
		
		
	}

	
	 @Id
	    @GeneratedValue
	    @Column(name = "idprovincia")
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Contact> getContact() {
		return Contact;
	}

	public void setContact(List<Contact> contact) {
		Contact = contact;
	}

	public List<Phone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}

	public List<Address> getAddress() {
		return Address;
	}

	public void setAddress(List<Address> address) {
		Address = address;
	}


	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", Contact=" + Contact + ", phoneList=" + phoneList
				+ ", Address=" + Address + "]";
	}
   
	
	
	
		
	
}
