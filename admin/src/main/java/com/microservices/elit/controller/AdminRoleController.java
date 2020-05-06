package com.microservices.elit.controller;



import java.util.List;
import java.util.Set;

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

import com.microservices.elit.messaging.RabbitRoleMessagingService;
import com.microservices.elit.model.AdminRole;
import com.microservices.elit.model.HTTPTYPE;
import com.microservices.elit.model.Role;

import com.microservices.elit.model.RoleCRUD;
import com.microservices.elit.repo.AdminRoleRepo;



@RestController
public class AdminRoleController {
	
	@Autowired
	AdminRoleRepo tr;
	
	@Autowired
	RabbitRoleMessagingService r;
	
	@GetMapping(path="/AdminRole",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_get() { 
		
		
		try {
			List<AdminRole> result = tr.findAll();
			
			return new ResponseEntity<List<AdminRole>>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<List<AdminRole>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(path="/AdminRole/{id}",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_get_id(@PathVariable int id) { 
		
		
		try {
			AdminRole result = tr.findOne(id);
			
			return new ResponseEntity<AdminRole>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminRole>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(path="/AdminRole",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_post(@RequestBody AdminRole t) { 
		
		
		try {
			AdminRole result = tr.save(t);
			
			Role u=new Role(t);
			
			RoleCRUD tt = new RoleCRUD(u,HTTPTYPE.POST);
			
			r.sendRole(tt);
			
			return new ResponseEntity<AdminRole>( result, HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminRole>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PutMapping(path="/AdminRole",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_put(@RequestBody AdminRole t) { 
		
		
		try {
			AdminRole result = tr.save(t);
			
			Role u=new Role(t);
			
			RoleCRUD tt = new RoleCRUD(u,HTTPTYPE.PUT);
			
			r.sendRole(tt);
			
			return new ResponseEntity<AdminRole>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminRole>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping(path="/AdminRole",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_delete(@RequestBody AdminRole t) { 
		
		
		try {
			tr.delete(t);
			
	Role u=new Role(t);
			
			RoleCRUD tt = new RoleCRUD(u,HTTPTYPE.PUT);
			
			r.sendRole(tt);
			
			return new ResponseEntity<AdminRole>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminRole>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping(path="/AdminRole/{id}",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_delete_id(@PathVariable int id) { 
		
		
		try {
			tr.delete(id);
			
			RoleCRUD tt = new RoleCRUD(new Role(id,""),HTTPTYPE.DELETEBYID);
			
			r.sendRole(tt);
			
			return new ResponseEntity<AdminRole>( HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminRole>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}