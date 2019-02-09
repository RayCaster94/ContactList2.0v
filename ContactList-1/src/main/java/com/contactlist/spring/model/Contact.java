package com.contactlist.spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "persona")
public class Contact implements Serializable{

	
	//ESTA ES LA ÚNICA CLASE QUE TIENE LAS RELACIONES ESTABLECIDAS CON LAS OTRAS CLASES.
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int contactId;
	private String contactName;
	private String contactSurname;
	private String contactLastSurname;
	private String dni;
	private Date birthDate;
	
	//conexiones
	@JoinColumn(name = "iddireccion", referencedColumnName = "idpersona")
	@OneToMany
	private Address address;
	
	@JoinColumn(name = "idprovincia")
	@OneToOne
	private City city;
	
	@JoinColumn(name = "idtelefono", referencedColumnName = "idpersona")
	@OneToMany
	private List<Phone> phoneList;
	
	public Contact() {
		
	}

	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	public String getContactSurname() {
		return contactSurname;
	}
	public void setContactSurname(String contactSurname) {
		this.contactSurname = contactSurname;
	}
	
	public String getContactLastSurname() {
		return contactLastSurname;
	}
	public void setContactLastSurname(String contactLastSurname) {
		this.contactLastSurname = contactLastSurname;
	}
	
	public String getdni() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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

	public List<Phone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactSurname=" + contactSurname
				+ ", contactLastSurname=" + contactLastSurname + ", dni=" + dni + ", birthDate=" + birthDate
				+ ", address=" + address + ", city=" + city + ", phoneList=" + phoneList + "]";
	}


	
}
