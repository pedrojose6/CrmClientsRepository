package com.example.CRMSpringBoot.TestServices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.CRMSpringBoot.Services.ContactService;

class TestContact {

	private static ContactService service;
	
	@BeforeAll
	public static void init() {
		service = new ContactService();	
	}
	
	@Test
	void userCreate_whenCalled_shouldReturnTrueIfUserIsCreated() {
		
		boolean result = service.createUser(1, "Llamada Telefonica", "11-29-2022", "Quedada en la oficina para firma el contrato.");
		
		assertEquals(result, true);
	}
	

}
