package com.example.CRMSpringBoot.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.CRMSpringBoot.Models.Contact;

@Component
public class ContactService {
	
	private ArrayList<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<>();
		
		Contact contact1 = new Contact(1, "Llamada Telefonica", "2020-11-29", "Posible contrato con Juan De Dios de Canena para ser autonomo");
		Contact contact2 = new Contact(2, "Email", "2021-12-03", "Email de una persona para concordar una reunion el proximo miercoles");
		Contact contact3 = new Contact(3, "Llamada Telefonica", "2019-04-04", "Cliente realizado con exito");
		Contact contact4 = new Contact(4, "Email", "2022-10-10", "Cliente realizado con exito");
		Contact contact5 = new Contact(5, "LLamada Telefonica", "2022-03-18", "Llamada para pedir datos");
		Contact contact6 = new Contact(6, "Email", "2022-12-12", "Cliente realizado con exito");

		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		contactList.add(contact4);
		contactList.add(contact5);
		contactList.add(contact6);
	
		
	}
	
	public boolean createUser(int id, String string, String string2, String string3) {
		
		Contact contact1 = new Contact(id, string, string2, string3);
		
		if(!contactList.contains(contact1)) {
			contactList.add(contact1);
			return true;
		}else {
			return false;
		}
	}
	
	public Contact save(Contact contact) {
		
		contactList.add(contact);
		return contact;
		
	}

	public ArrayList<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(ArrayList<Contact> contactList) {
		this.contactList = contactList;
	}
	
	
	

}
