package com.case1.ponte;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "Ponte API", version = "1.1", description = "Documentation Ponte API v1.0"))
public class PonteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PonteApplication.class, args);
	}

}
