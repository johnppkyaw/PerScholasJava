package dev.johnkyaw.schoolserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SchoolserviceclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolserviceclientApplication.class, args);
	}

}
