package dev.johnkyaw.FUploadDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FUploadDemoApplication {

	public static void main(String[] args) {
		//absolute path
//		System.out.println(System.getProperty("user.dir"));
		SpringApplication.run(FUploadDemoApplication.class, args);
	}

}
