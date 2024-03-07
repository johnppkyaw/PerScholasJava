package dev.johnkyaw.UploadPDF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class UploadPdfApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadPdfApplication.class, args);
	}

}
