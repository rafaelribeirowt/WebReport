package com.raizes.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raizes.entities.LinkUser;
import com.raizes.feignclients.LinkUserFeignClient;

@Service
public class LinkUserService {
	
	private static Logger logger = LoggerFactory.getLogger(LinkUserService.class);
	
	
	@Autowired
	private LinkUserFeignClient linkUserFeignClient;
	
	
	public LinkUser findbyemail(String loginUsuario) {
		
		LinkUser user = linkUserFeignClient.findByEmail(loginUsuario).getBody();
		if (user == null) {
			logger.error("usuario não encontrado" + loginUsuario );
			throw new IllegalArgumentException("Usuario não encontrado"); 
		}
		logger.info("Usuario encontrado" + loginUsuario);
		return user;
		
	}

}
