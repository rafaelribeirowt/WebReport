package com.raizes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WebReportEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebReportEurekaApplication.class, args);
	}

}
