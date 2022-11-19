package com.raizes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raizes.entities.LinkProdutos;
import com.raizes.repository.LinkProdRepository;


@Service
public class LinkService {
	
	
	
	@Autowired
	private LinkProdRepository repository;
	
	public List<LinkProdutos> findAll() {
		return repository.findAll();
	
	}
	
	public LinkProdutos findById(Long id) {
		Optional<LinkProdutos> obj = repository.findById(id);
		return obj.get();
	}
	
}
