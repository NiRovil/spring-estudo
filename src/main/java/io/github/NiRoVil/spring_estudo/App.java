package io.github.NiRoVil.spring_estudo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import io.github.NiRoVil.spring_estudo.testeAnnotation.Animal;
import io.github.NiRoVil.spring_estudo.testeAnnotation.Dog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App 
{
	
	/*
	 * @Autowired
	 * @Qualifier("applicationName")
	 * 
	 * We could use this annotations in pair with the ConfigurationApp class, or
	 * by simply using the application.properties file.
	 * 
	 * Like below.
	 */ 
	@Value("${application.name}")
	private String applicationName;

	@Dog
	private Animal animal;

	@Bean
	public CommandLineRunner executar() {
		return args -> {this.animal.makeNoise();};
	}
	
	//@GetMapping - It maps the HTTP GET requests on the specific handler method.
	@GetMapping("/hello") 
	public String hello() {
		return applicationName;
	}
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
