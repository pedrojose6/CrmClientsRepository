package com.example.CRMSpringBoot.Models;

import java.util.List;

public class OportunityClient {
	
	private int id;
	private String name;
	private String phoneNumber;
	private String email;
	//private List<Contact> contactList;
	private int contactId;
	private int client;
	
	//constructor vacio
	public OportunityClient() {}

	//constructor con parametros
	public OportunityClient(int id, String name, String phoneNumber, String email, /*List<Contact> contactList*/int contactId,
			int getIsClient) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.contactId = contactId;
		//this.contactList = contactList;
		this.client = getIsClient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	/*public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}*/

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}


	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "OportunityClient [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", contactId=" + contactId + ", isClient=" + client + "]";
	}
	
	
	
	

}
