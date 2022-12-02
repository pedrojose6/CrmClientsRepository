package com.example.CRMSpringBoot.TestServices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.CRMSpringBoot.Models.OportunityClient;
import com.example.CRMSpringBoot.Services.ContactService;
import com.example.CRMSpringBoot.Services.OportunityClientService;

class TestOportunityClient {

	private static OportunityClientService service;
	private static ContactService contactService;
	
	@BeforeAll
	public static void init() {
		service = new OportunityClientService();	
		contactService = new ContactService();
	}
	
	@Test
	void oportunityClientCreate_whenCalled_shouldReturnTrueIfUserIsCreated() {
		
		boolean result = service.createOportunity(1, "Juan De Dios", "612312312", "juande@gmail.com", 1, 1);
		
		assertEquals(result, true);
	}

}
