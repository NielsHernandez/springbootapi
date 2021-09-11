package com.api.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.modelo.Factura;

@Repository
public interface InterfaceFactura extends CrudRepository<Factura, Integer> {
	
	
	

}
