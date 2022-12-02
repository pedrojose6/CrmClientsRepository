package com.example.CRMSpringBoot.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.CRMSpringBoot.Models.Contact;
import com.example.CRMSpringBoot.Models.OportunityClient;

@Component
public class OportunityClientService {

	ArrayList<OportunityClient> oportunityClientList;
	ContactService contactService;

	public OportunityClientService() {
		oportunityClientList = new ArrayList<>();
		contactService = new ContactService();

		OportunityClient client1 = new OportunityClient(1, "Juan De Dios", "612312312", "juande@gmail.com",
				1, 1);
		OportunityClient client2 = new OportunityClient(2, "Pepe", "123123132", "pepe@gmail.com",
				2, 0);
		OportunityClient client3 = new OportunityClient(3, "Manuel", "789789798", "manuel@gmail.com",
				3, 1);
		OportunityClient client4 = new OportunityClient(4, "Federico", "456456456", "fede@gmail.com",
				4, 0);
		OportunityClient client5 = new OportunityClient(5, "Juana", "321321321", "juana@gmail.com",
				5, 1);
		OportunityClient client6 = new OportunityClient(6, "Ana Maria", "612312312", "anamari@gmail.com",
				6, 1);

		oportunityClientList.add(client1);
		oportunityClientList.add(client2);
		oportunityClientList.add(client3);
		oportunityClientList.add(client4);
		oportunityClientList.add(client5);
		oportunityClientList.add(client6);

	}

	public boolean createOportunity(int id, String string, String string2, String string3,
			int contactId, int b) {

		OportunityClient oporClient = new OportunityClient(id, string, string2, string3, contactId, b);

		if (!oportunityClientList.contains(oporClient)) {
			oportunityClientList.add(oporClient);
			return true;
		} else {
			return false;
		}
	}
	
	public OportunityClient save(OportunityClient oportunityClient) {
		
		oportunityClientList.add(oportunityClient);
		return oportunityClient;
		
	}

	public ArrayList<OportunityClient> getOportunityClientList() {
		return oportunityClientList;
	}

	public void setOportunityClientList(ArrayList<OportunityClient> oportunityClientList) {
		this.oportunityClientList = oportunityClientList;
	}

	public void darAlta(int id) {
		for(OportunityClient opor : oportunityClientList) {
			if(opor.getId()==id) {
				opor.setClient(0);
			}
		}
	}
	
	public void darBaja(int id) {
		for(OportunityClient opor : oportunityClientList) {
			if(opor.getId()==id) {
				opor.setClient(1);
			}
		}
	}
	
	
	


}
