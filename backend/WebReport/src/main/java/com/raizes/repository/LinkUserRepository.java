package com.raizes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raizes.entities.LinkUser;

public interface LinkUserRepository extends JpaRepository<LinkUser, Long>{
	
	LinkUser findByloginUsuario(String loginUsuario);

}
