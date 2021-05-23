package com.foop.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeliveryClassesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryClassesServiceApplication.class, args);
	}

}
