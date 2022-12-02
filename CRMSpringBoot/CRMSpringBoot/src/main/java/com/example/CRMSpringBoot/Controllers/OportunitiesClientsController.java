package com.example.CRMSpringBoot.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRMSpringBoot.Models.Contact;
import com.example.CRMSpringBoot.Models.OportunityClient;
import com.example.CRMSpringBoot.Services.ContactService;
import com.example.CRMSpringBoot.Services.OportunityClientService;

@RestController
@CrossOrigin("*")
public class OportunitiesClientsController {

	@Autowired
	private OportunityClientService service;

	@GetMapping("/oportunities")
	public ArrayList<OportunityClient> getAllContacts() {
		return service.getOportunityClientList();
	}
	
	@PostMapping("/saveOportunitie")
	public  OportunityClient save(@RequestBody OportunityClient oportunitieClient){
	    return service.save(oportunitieClient);
	}
	
	@PutMapping("/users/{id}/isNoClient")
	public void darBaja(@PathVariable int id){
	    service.darBaja(id);
	}
	
	@PutMapping("/users/{id}/isClient")
	public void darAlta(@PathVariable int id){
	    service.darAlta(id);
	}
	
}
