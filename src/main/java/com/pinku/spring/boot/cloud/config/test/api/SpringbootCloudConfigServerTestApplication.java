package com.pinku.spring.boot.cloud.config.test.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// https://www.youtube.com/watch?v=q1D1TNfsdhA&t=13s

@SpringBootApplication
@EnableEurekaClient
@RestController("/api")
public class SpringbootCloudConfigServerTestApplication {

	@Value("${microservices.service.name}")
	private String name;

	@GetMapping("/show")
	public String getName(){
		return "your config server name is : "+name;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudConfigServerTestApplication.class, args);
	}

}
