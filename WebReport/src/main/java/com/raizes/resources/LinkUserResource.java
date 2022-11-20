package com.raizes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raizes.entities.LinkUser;
import com.raizes.repository.LinkUserRepository;

@RestController
@RequestMapping(value = "/users")
public class LinkUserResource {
	
	
	
	@Autowired
	private LinkUserRepository repository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<LinkUser> findById(@PathVariable Long id) {
		LinkUser obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<LinkUser> findByEmail(@RequestParam String loginUsuario) {
		LinkUser obj = repository.findByloginUsuario(loginUsuario);
		return ResponseEntity.ok(obj);
	}
	

}
