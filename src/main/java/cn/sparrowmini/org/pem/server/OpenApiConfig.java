package cn.sparrowmini.org.pem.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.Type;

@Configuration
public class OpenApiConfig {

	/**
	 * 
	 * @return OpenApi
	 */
	@Bean
	public OpenAPI springShopOpenAPI() {
		SecurityScheme securityScheme = new SecurityScheme();
		securityScheme.setScheme("bearer");
		securityScheme.setType(Type.HTTP);
		securityScheme.setBearerFormat("JWT");
		
		return new OpenAPI()
				.components(new Components().addSecuritySchemes("bearerAuth",securityScheme ))
				.addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
				.info(new Info().title("Sparrow Org Service")
				.description("组织管理").version("v0.0.1"));
	}
}
