package com.raizes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raizes.entities.LinkUser;
import com.raizes.services.LinkUserService;

@RestController
@RequestMapping(value = "/users")
public class LinkUserResource {
	
	@Autowired
	private LinkUserService service;
	
	@GetMapping(value = "/search")
	public ResponseEntity<LinkUser> findByEmail(@RequestParam String loginUsuario){
		try {
		LinkUser user = service.findbyemail(loginUsuario);
		return ResponseEntity.ok(user);
		}
		catch(IllegalArgumentException e ) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		
		
		
		}
	

}
