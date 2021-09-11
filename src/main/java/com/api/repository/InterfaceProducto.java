package com.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.modelo.Producto;



@Repository
public interface InterfaceProducto extends CrudRepository<Producto, Integer>{

}
