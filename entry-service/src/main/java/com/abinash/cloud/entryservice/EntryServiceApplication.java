package com.abinash.cloud.entryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EntryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntryServiceApplication.class, args);
	}

	@RequestMapping
	public String getEntry() {
		return "Entry!";
	}

}
