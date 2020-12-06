package com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)

				.select()
				.apis(RequestHandlerSelectors
						.basePackage("com.Itau.Unibanco.Desafio.ItauUnibancoDesafioDeProgramacao.controller"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Desafio Itaú")
				.description("Desafio solicitado no processo seletivo do Itaú Unibanco, Engenheiro de Software. ")
				.version("1.0").contact(contact()).build();
	}

	private Contact contact() {
		return new Contact("Weslley Rocha", "https://weslleyrocha.github.io/Portfolio/",
				"Estudante de desenvolvimento de sistemas.");
	}
}
