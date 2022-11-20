package com.raizes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class WebReportOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebReportOauthApplication.class, args);
	}

}
