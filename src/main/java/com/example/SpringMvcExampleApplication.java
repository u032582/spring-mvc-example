package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class SpringMvcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcExampleApplication.class, args);
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("SpringOpenAPIサンプル API").description("Spring openapi sample application").version("v0.0.1")
						.license(new License().name("Apache 2.0").url("http://xxxxxxx.org")))
				.externalDocs(new ExternalDocumentation().description("Spring openapi Wiki Documentation")
						.url("https://springopenapi.wiki.github.org/docs"));
	}
}
