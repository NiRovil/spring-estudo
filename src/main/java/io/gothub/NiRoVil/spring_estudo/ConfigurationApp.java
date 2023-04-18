package io.gothub.NiRoVil.spring_estudo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration is an annotation to configure some classes or methods in our APP.
@Configuration
public class ConfigurationApp {
	
	//@Bean is an annotation to set the configuration in our methods.
	@Bean(name = "applicationName")
	public String applicationName() {
		return "Sistema de Vendas";
	}
	
}
