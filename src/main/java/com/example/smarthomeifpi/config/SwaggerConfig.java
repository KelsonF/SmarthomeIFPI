package com.example.smarthomeifpi.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI OpenApiConfig(){
        return new OpenAPI().
                info(new Info().title("Smart Home API")
                        .description("Generic API description")
                        .version("1.0"));
    }
}