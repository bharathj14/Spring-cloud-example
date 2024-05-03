package com.cloud.EurekaClientDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDoctorApplication.class, args);
	}

}
