package com.example.CRMSpringBoot.Controllers;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.CRMSpringBoot.Models.Contact;
import com.example.CRMSpringBoot.Services.ContactService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin("*")
public class ContactController {

	@Autowired
	private ContactService service;

	@GetMapping("/contacts")
	public ArrayList<Contact> getAllContacts() {
		return service.getContactList();
	}

	/*
	 * @GetMapping("/addContact/{id}/{type}/{date}/{description}") public Contact
	 * save(@PathVariable("id") int id, @PathVariable("type") String
	 * type, @PathVariable("date") String date, @PathVariable("description") String
	 * description, @RequestBody Contact contact) {
	 * 
	 * Contact contacto = new Contact(id, type, date, description); return
	 * service.save(contacto); }
	 */

	/*
	 * @RequestMapping("/addContact/{id}/{type}/{date}/{description}") public
	 * Contact save(@PathVariable int id, @PathVariable String type, @PathVariable
	 * String date, @PathVariable String description) {
	 * 
	 * Contact contacto = new Contact(id, type, date, description); return
	 * service.save(contacto); }
	 */

	@PostMapping("/save/{id}/{type}/{date}/{description}")
	public ResponseEntity<Contact> save(@PathVariable int id, @PathVariable String type, @PathVariable String date,
			@PathVariable String description, Model model) {

		Contact contact = new Contact(id, type, date, description);
		model.addAttribute("id", id);
		model.addAttribute("type", type);
		model.addAttribute("date", date);
		model.addAttribute("description", description);
		service.save(contact);
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);

	}
	
	/*@PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
	public Contact save(@RequestBody Contact person, HttpServletResponse response) {
	    response.setHeader("Location", ServletUriComponentsBuilder.fromCurrentContextPath()
	      .path("/save").toString());
	    
	    return service.save(person);
	}*/
	
	@PostMapping("/save")
	public  Contact save(@RequestBody Contact contacto){
	    return service.save(contacto);
	}


}
