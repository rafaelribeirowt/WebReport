package com.raizes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raizes.entities.LinkProdutos;
import com.raizes.service.LinkService;

@RestController
@RequestMapping(value = "/produtos")
public class LinkResourses {

	
	@Autowired
	private LinkService service;
	
	
	@GetMapping
	public ResponseEntity<List<LinkProdutos>> findAll() {

		List<LinkProdutos> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<LinkProdutos> findById(@PathVariable Long id){
		
		LinkProdutos obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	
	
}
