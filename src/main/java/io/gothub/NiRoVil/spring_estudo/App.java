package io.gothub.NiRoVil.spring_estudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App 
{
	
	@Autowired
	@Qualifier("applicationName")
	private String applicationName;
	
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
