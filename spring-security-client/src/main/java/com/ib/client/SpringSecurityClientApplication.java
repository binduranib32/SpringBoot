package com.ib.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ib.client")
public class SpringSecurityClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringSecurityClientApplication.class, args);
	}

}
