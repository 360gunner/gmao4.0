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

import com.microservices.elit.messaging.RabbitUsersMessagingService;
import com.microservices.elit.model.AdminRole;
import com.microservices.elit.model.AdminUtilisateur;
import com.microservices.elit.model.HTTPTYPE;
import com.microservices.elit.model.Role;
import com.microservices.elit.model.Users;
import com.microservices.elit.model.UsersCRUD;
import com.microservices.elit.repo.AdminUtilisateurRepo;



@RestController
public class AdminUtilisateurController {
	
	@Autowired
	AdminUtilisateurRepo tr;
	
	@Autowired
	RabbitUsersMessagingService r;
	
	@GetMapping(path="/AdminUtilisateur",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_get() { 
		
		
		try {
			List<AdminUtilisateur> result = tr.findAll();
			
			return new ResponseEntity<List<AdminUtilisateur>>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<List<AdminUtilisateur>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(path="/AdminUtilisateur/{id}",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_get_id(@PathVariable int id) { 
		
		
		try {
			AdminUtilisateur result = tr.findOne(id);
			
			return new ResponseEntity<AdminUtilisateur>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminUtilisateur>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(path="/AdminUtilisateur",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_post(@RequestBody AdminUtilisateur t) { 
		
		
		try {
			AdminUtilisateur result = tr.save(t);
			
			Users u=new Users();
			if (t.getActive()) {
				u.setActive(1);
			}
			else
				{u.setActive(0);}
			
			u.setEmail(t.getEmail());
			
			u.setId(t.getId());
			
			u.setName(t.getLogin());
			
			u.setLastName(t.getNom());
			
			u.setPassword(t.getPwd());
			
			Set<Role> c = null;
			
			for(int i=0;i<t.getRoles().size();i++) {
				c.add(new Role((AdminRole)t.getRoles().toArray()[i]));
			}
			
			u.setRoles(c);
			
			UsersCRUD tt = new UsersCRUD(u,HTTPTYPE.POST);
			
			r.sendUsers(tt);
			
			return new ResponseEntity<AdminUtilisateur>( result, HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminUtilisateur>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PutMapping(path="/AdminUtilisateur",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_put(@RequestBody AdminUtilisateur t) { 
		
		
		try {
			AdminUtilisateur result = tr.save(t);
			
			Users u=new Users();
			if (t.getActive()) {
				u.setActive(1);
			}
			else
				{u.setActive(0);}
			
			u.setEmail(t.getEmail());
			
			u.setId(t.getId());
			
			u.setName(t.getLogin());
			
			u.setLastName(t.getNom());
			
			u.setPassword(t.getPwd());
			
			Set<Role> c = null;
			
			for(int i=0;i<t.getRoles().size();i++) {
				c.add(new Role((AdminRole)t.getRoles().toArray()[i]));
			}
			
			u.setRoles(c);
			
			UsersCRUD tt = new UsersCRUD(u,HTTPTYPE.PUT);
			
			r.sendUsers(tt);
			
			return new ResponseEntity<AdminUtilisateur>( result, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminUtilisateur>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping(path="/AdminUtilisateur",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_delete(@RequestBody AdminUtilisateur t) { 
		
		
		try {
			tr.delete(t);
			
			Users u=new Users();
			if (t.getActive()) {
				u.setActive(1);
			}
			else
				{u.setActive(0);}
			
			u.setEmail(t.getEmail());
			
			u.setId(t.getId());
			
			u.setName(t.getLogin());
			
			u.setLastName(t.getNom());
			
			u.setPassword(t.getPwd());
			
			Set<Role> c = null;
			
			for(int i=0;i<t.getRoles().size();i++) {
				c.add(new Role((AdminRole)t.getRoles().toArray()[i]));
			}
			
			u.setRoles(c);
			
			UsersCRUD tt = new UsersCRUD(u,HTTPTYPE.DELETE);
			
			r.sendUsers(tt);
			
			return new ResponseEntity<AdminUtilisateur>( HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminUtilisateur>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping(path="/AdminUtilisateur/{id}",produces="application/json")
	public @ResponseBody ResponseEntity<?> hello_delete_id(@PathVariable int id) { 
		
		
		try {
			tr.delete(id);
			
			UsersCRUD tt = new UsersCRUD(new Users(id,""),HTTPTYPE.DELETEBYID);
			
			r.sendUsers(tt);
			
			return new ResponseEntity<AdminUtilisateur>( HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<AdminUtilisateur>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}