package com.jsk.clean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("jsk-clean")
                .description("Clean Architecture Project Example")
                .version("1.0.0")
                .license("MIT")
                .contact(new Contact("Joska", "", "asd@dsa.zxc"))
                .build();
    }

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jsk.clean.controller"))
                .paths(PathSelectors.any())
                .build();
    }

}
