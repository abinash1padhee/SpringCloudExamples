package com.abinash.cloud.exitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ExitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExitServiceApplication.class, args);
	}

	@RequestMapping
	public String getExit() {
		return "Exit!";
	}

}
