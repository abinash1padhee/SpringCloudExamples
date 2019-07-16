package com.abinash.cloud.ribbonappwithoutdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

@SpringBootApplication
@RestController
@RibbonClient(name = "time-service")
public class RibbonAppWithoutDiscoveryApplication {

	@Inject
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RibbonAppWithoutDiscoveryApplication.class, args);
	}

	@GetMapping
	public String getTime() {
		return restTemplate.getForEntity("http://time-service", String.class).getBody();
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
