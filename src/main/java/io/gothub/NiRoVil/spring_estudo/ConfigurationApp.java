package io.gothub.NiRoVil.spring_estudo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {
	
	@Bean(name = "applicationName")
	public String applicationName() {
		return "Sistema de Vendas";
	}
	
}
