package com.api.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.modelo.Detalle;


@Repository
public interface InterfaceDetalle extends CrudRepository<Detalle, Integer> {
	
	
	

}
