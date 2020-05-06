package com.microservices.elit.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.microservices.elit.messaging.RabbitMaintenanceMessagingService;
import com.microservices.elit.model.AchatArrivage;
import com.microservices.elit.model.HTTPTYPE;
import com.microservices.elit.model.MontantCRUD;
import com.microservices.elit.repo.AchatArrivageRepo;


@RestController
public class AchatArrivageController {
	
	@Autowired
	AchatArrivageRepo tr;
	
	@Autowired
	RabbitMaintenanceMessagingService r;
	
	@GetMapping(path="/AchatArrivage",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_get() { 
		
		
		try {
			List<AchatArrivage> result = tr.findAll();
			
			return new ResponseEntity<List<AchatArrivage>>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<List<AchatArrivage>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(path="/AchatArrivage/{id}",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_get_id(@PathVariable int id) { 
		
		
		try {
			AchatArrivage result = tr.findOne(id);
			
			return new ResponseEntity<AchatArrivage>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AchatArrivage>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(path="/AchatArrivage",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_post(@RequestBody AchatArrivage t) { 
		
		
		try {
			AchatArrivage result = tr.save(t);
			
			MontantCRUD tt = new MontantCRUD(t.getMontant(),t.getDemandes().get(0).getId(),HTTPTYPE.PUT);
			
			r.sendQtPrix(tt);
			
			return new ResponseEntity<AchatArrivage>( result, HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<AchatArrivage>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PutMapping(path="/AchatArrivage",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_put(@RequestBody AchatArrivage t) { 
		
		
		try {
			AchatArrivage result = tr.save(t);
			
			MontantCRUD tt = new MontantCRUD(t.getMontant(),t.getDemandes().get(0).getId(),HTTPTYPE.POST);
			
			r.sendQtPrix(tt);
			
			return new ResponseEntity<AchatArrivage>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AchatArrivage>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping(path="/AchatArrivage",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_delete(@RequestBody AchatArrivage t) { 
		
		
		try {
			tr.delete(t);
			
			
			return new ResponseEntity<AchatArrivage>( t, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AchatArrivage>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping(path="/AchatArrivage/{id}",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_delete_id(@PathVariable int id) { 
		
		
		try {
			tr.delete(id);
			

			
			return new ResponseEntity<AchatArrivage>( HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AchatArrivage>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}