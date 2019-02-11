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

import org.springframework.beans.factory.annotation.Autowired;

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
	@Column(name = "idpersona")
	private Integer contactId;
	@Column(name ="nombre")
	private String contactName;
	@Column(name ="apellido1")
	private String contactSurname;
	@Column(name ="apellido2")
	private String contactLastSurname;
	@Column(name ="dni")
	private String dni;
	@Column(name ="fechanacimiento")
	private Date birthDate;
	
	//conexiones
	//@JoinColumn(name = "iddireccion", referencedColumnName = "idpersona")
	//@OneToMany
	//private Address address;
	
	//@JoinColumn(name = "idprovincia")
	//@OneToOne
	//private City city;
	
	//@JoinColumn(name = "idtelefono", referencedColumnName = "idpersona")
	//@OneToMany
	//private List<Phone> phoneList;
	
	public Contact() {
		
	}
	
	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	

	
	
	

	
}
