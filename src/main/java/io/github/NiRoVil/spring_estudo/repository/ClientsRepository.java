package io.github.NiRoVil.spring_estudo.repository;

import org.springframework.stereotype.Repository;

import io.github.NiRoVil.spring_estudo.model.Client;

//This class is our database.
@Repository
public class ClientsRepository {

	public void persist(Client client) {
		//save the client in the database.
	}
	
}
