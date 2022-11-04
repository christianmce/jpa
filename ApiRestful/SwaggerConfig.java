package com.app.seminario.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer {
	
			@Override
			public void addResourceHandlers(ResourceHandlerRegistry registry) {
				registry
                	.addResourceHandler("swagger-ui.html")
                	.addResourceLocations("classpath:/META-INF/resources/");

				registry
                	.addResourceHandler("/webjars/**")
                	.addResourceLocations("classpath:/META-INF/resources/webjars/");
			}
	
			@Bean
			public Docket apiDocket() {
				return new Docket(DocumentationType.SWAGGER_2)
						.select()
						.apis(RequestHandlerSelectors.basePackage("com.app.seminario.controller"))
						.paths(PathSelectors.any())
						.build()
						.apiInfo(getApiInfo())
						;
			}
			
			private ApiInfo getApiInfo() {
				return new ApiInfoBuilder().title("Seminario-APIRestful")
						.description("Esta API ofrece recursos para administrar un conjunto de Categorías de productos")
						.version("1.0.0").build();
			}
			
}
