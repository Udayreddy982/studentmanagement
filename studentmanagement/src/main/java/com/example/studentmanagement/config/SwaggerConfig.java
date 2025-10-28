package com.example.studentmanagement.config; // Make sure this matches your actual package

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("Student Management API")
                        .description("API documentation for Student Service")
                        .version("1.0.0"));
    }
}
