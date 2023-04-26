package io.github.NiRoVil.spring_estudo.service;

import io.github.NiRoVil.spring_estudo.repository.ClientsRepository;
import org.springframework.stereotype.Service;

import io.github.NiRoVil.spring_estudo.model.Client;

//This class is our business rules.
@Service
public class ClientsService {
	
	private ClientsRepository repository;
	
	/* 
	 * @Autowired -- this will inject the dependency to our service. In this case @Repository.
	 * It could be used or omitted but the effect will be the same. The Spring container will 
	 * scan and identify the use of the annotation on the ClientsRepository class when the
	 * constructor get triggered.
	 */
	public ClientsService (ClientsRepository repository) {
		this.repository = repository;
	}
	
	public void saveClient(Client client) {
		validateClient(client);
		this.repository.persist(client);
	}
	
	public void validateClient(Client client) {
		//validate the information provided by the user.
	}
	
}
