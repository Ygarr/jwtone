package com.company.TestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// We need the following in order to detect the filter
// from the security package
@ServletComponentScan(value="com.company.TestProject.security")
public class SimpleJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleJwtApplication.class, args);
	}
}
