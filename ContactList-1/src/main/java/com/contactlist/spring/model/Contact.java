package com.contactlist.spring.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@Table(name = "persona")
//@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Contact implements Serializable {

	
	//ESTA ES LA ÚNICA CLASE QUE TIENE LAS RELACIONES ESTABLECIDAS CON LAS OTRAS CLASES.
	
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "idpersona")
	private int contactId;
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
	
	//bi-directional many-to-one association to Telefono
		@OneToMany(mappedBy="contact")
		private List<Phone> phones;
		
	
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

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	

	
}
