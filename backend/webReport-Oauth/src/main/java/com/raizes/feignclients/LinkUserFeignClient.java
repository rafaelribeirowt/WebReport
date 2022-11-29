package com.raizes.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.raizes.entities.LinkUser;

@Component
@FeignClient(name = "webreport", path = "/users")
public interface LinkUserFeignClient {
	
	@GetMapping(value = "/search")
	ResponseEntity<LinkUser> findByEmail(@RequestParam String loginUsuario);

}
