package com.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.modelo.Cliente;

@Repository
public interface InterfaceCliente extends CrudRepository<Cliente, Integer> {
	
	
	

}
