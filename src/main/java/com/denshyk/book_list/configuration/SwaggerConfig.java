package com.denshyk.book_list.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.denshyk.book_list.controller"))
                .build()
                .apiInfo(apiDetails());
    }

    public ApiInfo apiDetails() {
        return  new ApiInfo(
                "Book List API",
                "A simple CRUD API \"book list\" using Java, Spring Boot, MySQL, Lombok, Git.",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Tykhonov Denys", "https://github.com/denshykk", "denshykk@gmail.com"),
                "API License",
                "https://github.com/denshykk",
                Collections.emptyList()
        );
    }
}