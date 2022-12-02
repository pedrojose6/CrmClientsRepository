package com.example.CRMSpringBoot.Models;

import java.sql.Date;

public class Contact {
	
	private int id;
	//manera de contactar(tel, email...)
	private String type;
	private String dateContact;
	//descripcion de lo que se habla en la conversacion
	private String description;
	
	//constructor vacio
	public Contact() {}

	//constructor con parametros
	public Contact(int id, String type, String dateContact, String description) {
		super();
		this.id = id;
		this.type = type;
		this.dateContact = dateContact;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDateContact() {
		return dateContact;
	}

	public void setDateContact(String dateContact) {
		this.dateContact = dateContact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", type=" + type + ", dateContact=" + dateContact + ", description=" + description
				+ "]";
	}
	
	

	

}
